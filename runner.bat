@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
## - Capture any failures in a central file, then clean the artifacts
## - 'Applications' directory: compile all, run command lines, capture output and verify
## - Add command to check for superfluous inclusion of AtomicTest
## - Copy errors._ to Converting Exceptions with Try
import os, sys, shutil, re, inspect, pprint
from contextlib import contextmanager
from glob import glob
import argparse
from solutionDirs import solutionDirs # In order they appear in book

# Directory where runner.bat lives:
ROOT_DIR = os.path.dirname(os.path.abspath(inspect.getfile(inspect.currentframe())))

parser = argparse.ArgumentParser(description='With no arguments, runs all the scala scripts and capture any errors')
parser.add_argument("-f", "--file", nargs='+', action='store', help="Run only on the designated files")
parser.add_argument("-p", "--prerequisites", action='store_true', help="Compile prerequisites")
parser.add_argument("-c", "--clean", action='store_true', help="Remove 'run' artifacts")
parser.add_argument("-r", "--remove_results", action='store_true', help="Remove all results.txt files")
parser.add_argument("-s", "--simplify", action='store_true', help="Remove unimportant trace files & show non-empty error files")
parser.add_argument("-u", "--unusedfiles", action='store_true', help="Display non 'Solution-' and non 'Starter-' scala files")
parser.add_argument("-t", "--trace", action='store_true', help="Output trace information")
parser.add_argument("-d", "--debug", action='store_true', help="Output debug information")
args = parser.parse_args()

def main():
    if not any(vars(args).values()) or args.trace or args.debug: # Change this so it's ONLY args.trace on the CL
        run()
        return
    if args.file:
        for fname in args.file:
            runfile(fname)
        return
    if args.clean:
        clean()
        return
    if args.prerequisites:
        compilePrerequisites()
        return
    if args.simplify:
        simplify()
        return
    if args.unusedfiles:
        showUnusedFiles()
        return
    if args.remove_results:
        remove_results()
        return
    parser.print_help()


if args.trace:
    def trace(arg): pprint.pprint(arg)
else:
    def trace(arg): pass


if args.debug:
    def debug(arg): pprint.pprint(arg)
else:
    def debug(arg): pass


@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)


compileFiles = [
    # (Directory, [(file, artifact), (file, artifact), ...])
    ("ALittleReflection", [
        ("Name.scala", "com/atomicscala/Name.class"),
        ("Name2.scala", "com/atomicscala/Name2.class"),
    ]),
    ("Applications", [
        ("Solution-1.scala", "WhenAmI.class"),
        ("Solution-2.scala", "Battery1.class"),
        ("Solution-3.scala", "Battery2.class"),
    ]),
    ("ConstructorsAndExceptions", [
        ("CodeListing.scala", "codelisting/CodeListing.class"),
        ("CodeListingTester.scala", "codelistingtester/CodeListingTester.class"),
    ]),
    ("ImportsAndPackages-1stEdition", [
        ("Crest.scala", "com/atomicscala/royals/Crest.class"),
        ("TheRoyalty.scala", "com/atomicscala/royals/Royalty.class"),
        ("Trivia.scala", "com/atomicscala/trivia/Movies.class"),
    ]),
    ("ImportsAndPackages-2ndEdition", [
        ("EquilateralTriangle.scala", "com/atomicscala/pythagorean/EquilateralTriangle.class"),
        ("PythagoreanTheorem.scala", "com/atomicscala/pythagorean/RightTriangle.class"),
        ("Trivia.scala", "com/atomicscala/trivia/Movies.class"),
    ]),
    ("Summary2", [
        ("BasicMethods.scala", "com/atomicscala/BasicLibrary/WhizBang.class"),
        ("ClassBodies.scala", "com/atomicscala/Bodies/NoBody.class"),
    ]),
]


def compilePrerequisites():
    print "Compiling prerequisites"
    for direct, items in compileFiles:
        trace(direct)
        trace(items)
        with visitDir(os.path.join(ROOT_DIR, direct)):
            for scala, dep in items:
                trace(scala)
                trace(dep)
                if not os.path.exists(dep):
                    cmd = "scalac " + scala
                    print(direct + ": " + cmd)
                    os.system(cmd)


def run():
    compilePrerequisites()
    if os.getcwd().endswith("atomic-scala-solutions"):
        trace("Running all")
        for p in solutionDirs:
            print(p)
            with visitDir(p):
                for n in glob('Solution-*.scala'):
                    runfile(n)
    else:
        trace("Just running this directory")
        for n in glob('Solution-*.scala'):
            runfile(n)


def runfile(name):
    if os.path.exists("results.txt"):
        for line in file("results.txt").readlines():
            if name in line and "Failed" not in line:
                print line.rstrip()
                return
    base = name.rsplit('.')[0]
    outputFile = base + ".out"
    errorFile = base + ".err"
    if os.path.basename(os.getcwd()) in [f[0] for f in compileFiles]:
        trace("adding -nocompdaemon")
        flag = " -nocompdaemon "
    else:
        flag = ""
    cmd = "scala " + flag + name + " > " + outputFile + " 2> " + errorFile
    trace("    " + cmd)
    os.system(cmd)
    contents = file(name).read()
    OUTPUT_SHOULD_BE = re.search(r"OUTPUT_SHOULD_BE(.*)\*/", contents, re.DOTALL)
    OUTPUT_SHOULD_CONTAIN = re.search(r"OUTPUT_SHOULD_CONTAIN(.*)\*/", contents, re.DOTALL)
    if OUTPUT_SHOULD_BE:
        should_be = OUTPUT_SHOULD_BE.group(1).strip()
        trace("output should be [" + should_be + "]")
        if "warning:" in should_be:
            generated = open(errorFile).read().strip() + "\n" + open(outputFile).read().strip()
            debug("generated: [" + generated + "]")
            debug("should be: [" + should_be + "]")
            verify(name, should_be == generated)
        else:
            verify(name, should_be == open(outputFile).read().strip())
    elif OUTPUT_SHOULD_CONTAIN:
        should_contain = OUTPUT_SHOULD_CONTAIN.group(1).strip()
        trace("output should contain [" + should_contain + "]")
        if "error" in should_contain:
            verify(name, should_contain in file(errorFile).read())
        else: # Examine line-by-line
            results = file(outputFile).read()
            for line in should_contain.splitlines():
                trace("testing line " + line)
                trace(line in results)
                if not line in results:
                    verify(name, False)
            verify(name, True)
    else: # No "SHOULD"
        verify(name, len(file(errorFile).read()) == 0)


def verify(name, test):
    with file("results.txt", 'a') as results:
        if test:
            print("   " + name + ": Passed")
            print >>results, "!  " + name + ": Passed"
        else:
            print("   " + name + ": Failed")
            print >>results, "!  " + name + ": Failed"
            sys.exit(1)


def simplify():
    print "Simplifying"
    for p in solutionDirs:
        with visitDir(p):
            trace(os.path.basename(p))
            logs = glob("*.out") + glob("*.err") + glob("_AtomicTestErrors.txt")
            if "_AtomicTestErrors.txt" in "".join(logs):
                # Save the output files, only erase empty .err files
                trace("   _AtomicTestErrors.txt")
                for e in [f for f in logs if f.endswith(".err")]:
                    if not os.path.getsize(e):
                        trace("    removing " + os.path.basename(e))
                        os.remove(e)
            else:
                for e in [f for f in logs if f.endswith(".err")]:
                    trace("  ", e, os.path.getsize(e))
                    if not os.path.getsize(e):
                        # Remove .out and .err when .err is empty
                        trace("    removing " + os.path.basename(e) + " and " + os.path.splitext(e)[0] + ".out")
                        os.remove(e)
                        os.remove(os.path.splitext(e)[0] + ".out")


def clean():
    print "Cleaning"
    removals = [os.path.join(d[0], f) for d in os.walk(".") for f in d[2]
                if f.endswith(".out") or
                f.endswith(".err") or
                f == "_AtomicTestErrors.txt"]
    for r in removals:
        trace(r)
        os.remove(r)
    cf = set([os.path.join(".", direct, os.path.normpath(dep[1]).split(os.sep)[0])
              for direct, deps in compileFiles for dep in deps])
    trace(cf)
    for f in [f for f in cf if os.path.exists(f)]:
        trace(f)
        shutil.rmtree(f)


def showUnusedFiles():
    print "Unused files:"
    nsf = set([os.path.join(d[0], f) for d in os.walk(".") for f in d[2]
               if f.endswith(".scala") and not f.startswith("Solution-") and not f.startswith("Starter-")])
    cf = set([os.path.join(".", direct, dep[0]) for direct, deps in compileFiles for dep in deps])
    print "\n".join(nsf - cf)


def remove_results():
    for f in glob("results.txt") + glob("*/results.txt"):
        print "removing " + f
        os.remove(f)


if __name__ == '__main__':
    main()
