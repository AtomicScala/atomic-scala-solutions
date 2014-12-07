@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
## For individual directories, enable ..\runner so that it only runs in that directory
##   (Check current directory, if it's not the root then only run in this directory)
## - 'Applications' directory: compile all, run command lines, capture output and verify
## - To verify: Add commented "OUTPUT_SHOULD_BE" and compare with that
## - Add command to check for superfluous inclusion of AtomicTest
## - Copy errors._ to Converting Exceptions with Try
import os, sys, shutil
from contextlib import contextmanager
from glob import glob
import argparse

parser = argparse.ArgumentParser()
parser.add_argument("-r", "--run", action='store_true', help="Run all the scala scripts and capture any errors")
parser.add_argument("-s", "--simplify", action='store_true', help="Remove unimportant trace files & show non-empty error files")
parser.add_argument("-c", "--clean", action='store_true', help="Remove all 'run' artifacts")
parser.add_argument("-p", "--prerequisites", action='store_true', help="Compile prerequisites")
parser.add_argument("-u", "--unusedfiles", action='store_true', help="Display non 'Solution-' and non 'Starter-' scala files")
parser.add_argument("-t", "--test", action='store_true', help="Test")
args = parser.parse_args()

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)

paths = [os.path.join('.', p[0:-1]) for p in glob('*/')]

if args.test:
    for p in paths:
        with visitDir(p):
            print p + ": "
            for f in glob('*'):
                print "", f
    sys.exit()

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
        with visitDir(direct):
            for scala, dep in items:
                if not os.path.exists(dep):
                    cmd = "scalac " + scala
                    print direct + ":", cmd
                    os.system(cmd)


def run():
    compilePrerequisites()
    print "Running"
    for p in paths:
        print p
        with visitDir(p):
            for n in glob('Solution-*.scala'):
                base = n.rsplit('.')[0]
                cmd = "scala " + n + " > " + base + ".out 2> " + base + ".err"
                print "    " + cmd
                os.system(cmd)


def simplify():
    print "Simplifying"
    for p in paths:
        with visitDir(p):
            print os.path.basename(p)
            logs = glob("*.out") + glob("*.err") + glob("_AtomicTestErrors.txt")
            if "_AtomicTestErrors.txt" in "".join(logs):
                # Save the output files, only erase empty .err files
                print "   _AtomicTestErrors.txt"
                for e in [f for f in logs if f.endswith(".err")]:
                    if not os.path.getsize(e):
                        print "    removing " + os.path.basename(e)
                        os.remove(e)
            else:
                for e in [f for f in logs if f.endswith(".err")]:
                    print "  ", e, os.path.getsize(e)
                    if not os.path.getsize(e):
                        # Remove .out and .err when .err is empty
                        print "    removing " + os.path.basename(e) + " and " + os.path.splitext(e)[0] + ".out"
                        os.remove(e)
                        os.remove(os.path.splitext(e)[0] + ".out")


def clean():
    print "Cleaning"
    removals = [os.path.join(d[0], f) for d in os.walk(".") for f in d[2]
                if f.endswith(".out") or
                f.endswith(".err") or
                f == "_AtomicTestErrors.txt"]
    for r in removals:
        print r
        os.remove(r)
    cf = set([os.path.join(".", direct, os.path.normpath(dep[1]).split(os.sep)[0]) for direct, deps in compileFiles for dep in deps])
    # print "\n".join(cf)
    for f in [f for f in cf if os.path.exists(f)]:
        print f
        shutil.rmtree(f)


def showUnusedFiles():
    print "Unused files:"
    nsf = set([os.path.join(d[0], f) for d in os.walk(".") for f in d[2]
               if f.endswith(".scala") and not f.startswith("Solution-") and not f.startswith("Starter-")])
    cf = set([os.path.join(".", direct, dep[0]) for direct, deps in compileFiles for dep in deps])
    print "\n".join(nsf - cf)


if not any(vars(args).values()): parser.print_help()
if args.clean: clean() # Happens first with multiple command args
if args.prerequisites: compilePrerequisites()
if args.run: run()
if args.simplify: simplify()
if args.unusedfiles: showUnusedFiles()
