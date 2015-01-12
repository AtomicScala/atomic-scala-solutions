@setlocal enabledelayedexpansion && py.exe -x "%~f0" %* & exit /b !ERRORLEVEL!
# Note py.exe assumes installation of Python 3, but this program uses Python 2.7
## - Verify that methods use return type declarations before "Brevity" or wherever it becomes optional
##   (Also necessary to apply on book example code)
## - Do methods need parentheses before "Brevity"?
## - 'Applications' directory: compile all, run command lines, capture output and verify
## - Copy errors._ to Converting Exceptions with Try
## - Create different version of runner for book examples; extract new book examples and verify them
## - Make an install.bat file to check for and install Python?
##   (See http://codeboje.de/installing_python_on_demand/)
import os, sys, shutil, re, inspect, pprint, subprocess, string
from contextlib import contextmanager
from glob import glob
import argparse
from solutionDirs import solutionDirs # In order they appear in book
import colorama
colorama.init()

# Directory where runner.bat lives:
HOME_DIR = os.path.dirname(os.path.abspath(inspect.getfile(inspect.currentframe())))
ROOT_DIR = os.path.dirname(HOME_DIR)
SUCCEEDED = os.path.join(HOME_DIR, "Succeeded.txt")
SUBLIME = r'C:\Program Files\SublimeText2\sublime_text.exe'
if not os.path.exists(SUBLIME):
    SUBLIME = r'C:\Program Files\Sublime Text 3\sublime_text.exe'

parser = argparse.ArgumentParser(description='With no arguments, runs all the scala scripts and capture any errors')
parser.add_argument("-f", "--file", nargs='+', action='store', help="Run only on the designated files, force run even if it has passed")
parser.add_argument("-p", "--prerequisites", action='store_true', help="Compile prerequisites")
parser.add_argument("-c", "--clean", action='store_true', help="Remove 'run' artifacts")
parser.add_argument("-r", "--remove_results", action='store_true', help="Remove Succeeded.txt")
parser.add_argument("-s", "--simplify", action='store_true', help="Remove unimportant trace files & show non-empty error files")
parser.add_argument("-u", "--unusedfiles", action='store_true', help="Display non 'Solution-' and non 'Starter-' scala files")
parser.add_argument("-t", "--trace", action='store_true', help="Output trace information")
parser.add_argument("-d", "--debug", action='store_true', help="Output debug information")
parser.add_argument("--test", action='store_true', help="Run a test")
parser.add_argument("--sublime", action='store_true', help="Open Sublime Text on a failed file")
args = parser.parse_args()

if args.debug:
    def debug(arg): print(arg)
    debug.ing = True
    print "debug"
else:
    def debug(arg): pass
    debug.ing = False

###########################
# def debug(arg): print(arg)
# debug.ing = True
# print "debugging"
###########################

def main():
    "This is hacky"
    if args.clean:
        debug("clean")
        clean()
    if args.remove_results:
        debug("remove results")
        remove_results()
    if args.file:
        debug("Run one file")
        compilePrerequisites()
        debug("args.file: " + str(args.file))
        for fname in args.file:
            runfile(fname)
        return
    if not any(vars(args).values()) or args.trace or args.debug or args.sublime: # Change this so it's ONLY args.trace on the CL
        debug("Run all files")
        run()
        return
    if args.prerequisites:
        debug("Compile prerequisites")
        compilePrerequisites()
        return
    if args.simplify:
        simplify()
        return
    if args.unusedfiles:
        showUnusedFiles()
        return
    #parser.print_help()


if args.trace:
    def trace(arg): pprint.pprint(arg)
else:
    def trace(arg): pass

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)


# Might generalize runner by putting this in an external import
compileFiles = [
    # (Directory, [(file, artifact), (file, artifact), ...])
    (".", [
        ("AtomicTest.scala", "com/atomicscala/AtomicTest.class"),
    ]),
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
    ("Polymorphism", [
        ("Name.scala", "com/atomicscala/Name.class"),
    ]),
    ("BuildingSystemswithTraits", [
        ("SodaFountain.scala", "sodafountain/IceCream.class"),
    ]),
    ("PatternMatchingwithTuples", [
        ("PaintColors.scala", "paintcolors/Color.class"),
    ]),
    ("ConvertingExceptionswithTry", [
        ("Errors.scala", "errors/toss.class"),
        ("CodeListing.scala", "codelisting/CodeListing.class"),
    ]),
    ("CustomErrorReporting", [
        ("CodeListing.scala", "codelisting/CodeListing.class"),
        ("CodeListingTester.scala", "codelistingtester/CodeListingTester.class"),
        ("Fail.scala", "com/atomicscala/reporterr/Fail.class"),
    ]),
    ("DesignbyContract", [
        ("Solution-2.scala", "ConvertLetters.class"),
    ]),
    ("Logging", [
        ("Solution-3.scala", "LoggingTest.class"),
    ]),
    ("ExtensionMethods", [
        ("Solution-3.scala", "Test.class"),
    ]),
]


def compilePrerequisites():
    message = "Compiling prerequisites"
    def rebuild(scalaFile, dependency):
        if not os.path.exists(dependency):
            return True
        if os.path.getmtime(scalaFile) > os.path.getmtime(dependency):
            return True
        return False

    for direct, items in compileFiles:
        trace(direct)
        trace(items)
        with visitDir(os.path.join(ROOT_DIR, direct)):
            for scala, dep in items:
                trace(scala)
                trace(dep)
                if rebuild(scala, dep):
                    if message:
                        print(message)
                        message = None # Only display it once
                    cmd = "scalac " + scala
                    print(direct + ": " + cmd)
                    os.system(cmd)


def run():
    compilePrerequisites()
    if os.path.basename(os.getcwd()).startswith("atomic-scala-solutions"):
        debug("Running all")
        for p in solutionDirs:
            print(p)
            with visitDir(p):
                for n in glob('Solution-*.scala'):
                    runfile(n)
    else:
        debug("Just running this directory")
        for n in glob('Solution-*.scala'):
            runfile(n)

from collections import defaultdict

class SuccessfullyRun(object):

    def __init__(self):
        if os.path.exists(SUCCEEDED):
            with file(SUCCEEDED) as f:
                self.map = defaultdict(set, eval(f.read()))
        else:
            self.map = defaultdict(set)

    def contains(self, directory, filename):
        if self.map.has_key(directory):
            return filename in self.map[directory]
        else:
            return False

    def add(self, directory, filename):
        self.map[directory].add(filename)
        with file(SUCCEEDED, 'w') as f:
            f.write(pprint.pformat(self.map.items()))

    def clear_directory(self, directory):
        if self.map.has_key(directory):
            del self.map[directory]
            with file(SUCCEEDED, 'w') as f:
                f.write(pprint.pformat(self.map.items()))

    def __repr__(self):
        return pprint.pformat(self.map.items())


def runfile(fname):
    dirname = os.path.basename(os.getcwd())
    # Force run when using -f flag:
    if SuccessfullyRun().contains(dirname, fname) and not args.file: return

    def verify(test):
        if test:
            print("   " + fname + ": " + colorama.Back.GREEN + "Passed" + colorama.Style.RESET_ALL)
            SuccessfullyRun().add(dirname, fname)
        else:
            print("   " + fname + ": " + colorama.Back.RED + "Failed" + colorama.Style.RESET_ALL)
            if args.sublime:
                subprocess.call([SUBLIME, fname])
            sys.exit(0) # Nonzero exit code causes noise in sublime build output

    base = fname.rsplit('.')[0]
    outputFile = base + ".out"
    errorFile = base + ".err"

    if os.path.exists(errorFile): # Erase old errorFile
        os.remove(errorFile)

    if dirname in [f[0] for f in compileFiles]:
        trace("adding -nocompdaemon")
        flag = " -nocompdaemon "
    else:
        flag = ""

    cmd = "scala " + flag + fname

    contents = file(fname).read()

    if "// >" in contents: # Could use re here
        for  line in contents.splitlines():
            if "// >" in line:
                cmd = line.split("// >")[1]

    cmd += " > " + outputFile + " 2> " + errorFile
    debug("    " + cmd)
    os.system(cmd)

    OUTPUT_SHOULD_BE = re.search(r"OUTPUT_SHOULD_BE(.*)\*/", contents, re.DOTALL)
    OUTPUT_SHOULD_CONTAIN = re.search(r"OUTPUT_SHOULD_CONTAIN(.*)\*/", contents, re.DOTALL)
    VERIFY_BY_INSPECTION = re.search(r"VERIFY_BY_INSPECTION", contents)

    if OUTPUT_SHOULD_BE:
        should_be = OUTPUT_SHOULD_BE.group(1).strip()
        debug("should be: [\n" + pprint.pformat(should_be) + "\n]")
        if "warning:" in should_be:
            generated = open(errorFile).read().strip() + "\n" + open(outputFile).read().strip()
            debug("generated: [" + generated + "]")
            verify(should_be == generated)
        else:
            if os.path.exists(errorFile) and os.stat(errorFile).st_size:
                print(file(errorFile).read())
                debug(colorama.Back.RED + errorFile + " exists and is nonzero" + colorama.Style.RESET_ALL)
                verify(False)
            actual = open(outputFile).read().strip()
            actual = '\n'.join(map(string.rstrip, actual.splitlines()))
            debug("actual: [\n" + pprint.pformat(actual) + "\n]")
            verify(should_be == actual)

    elif OUTPUT_SHOULD_CONTAIN:
        should_contain = OUTPUT_SHOULD_CONTAIN.group(1).strip()
        if not should_contain: verify(False)
        def testAgainstFile(filename):
            results = file(filename).read()
            for line in should_contain.splitlines():
                if not line in results:
                    verify(False)
            verify(True)
        if "error" in should_contain or "warning" in should_contain or "Exception" in should_contain:
            testAgainstFile(errorFile)
        else:
            testAgainstFile(outputFile)

    elif VERIFY_BY_INSPECTION:
        verify(True)

    else: # No "SHOULD"
        debug("missing a SHOULD")
        verify(False) # Require a SHOULD

    # If file ran successfully, remove artifacts:
    if os.path.exists(outputFile) and not debug.ing :
        os.remove(outputFile)
    if os.path.exists(errorFile) and not debug.ing:
        os.remove(errorFile)


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
    "This is not working right"
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
    "If in a subdirectory, leaves everything else alone"
    dirname = os.path.basename(os.getcwd())
    if dirname != os.path.basename(ROOT_DIR):
        if os.path.exists(SUCCEEDED):
            print "clearing " + dirname + " from success results"
            SuccessfullyRun().clear_directory(dirname)
    else:
        if os.path.exists(SUCCEEDED):
            print "removing " + SUCCEEDED
            os.remove(SUCCEEDED)


if __name__ == '__main__':
    main()
