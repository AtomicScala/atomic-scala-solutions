@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
import os, sys
from contextlib import contextmanager
from glob import glob
import argparse

parser = argparse.ArgumentParser()
parser.add_argument("-r", "--run", action='store_true', help="Run all the scala scripts and capture any errors")
parser.add_argument("-s", "--simplify", action='store_true', help="Remove unimportant trace files")
parser.add_argument("-c", "--clean", action='store_true', help="Remove all 'run' artifacts")
args = parser.parse_args()
if not any(vars(args).values()):
    parser.print_help()

####################################################################
@contextmanager
def visitDir(d):
    os.chdir(d)
    yield d
    os.chdir("..")

paths = [os.path.join('.', p[0:-1]) for p in glob('*/')]

####################################################################
def run():
    for p in paths:
        print p
        with visitDir(p):
            for n in glob('Solution-*.scala'):
                base = n.rsplit('.')[0]
                cmd = "scala " + n + " > " + base + ".out 2> " + base + ".err"
                print "    " + cmd
                os.system(cmd)

if args.run:
    run()

####################################################################
def simplify():
    for p in paths:
        with visitDir(p):
            logs = glob(".out") + glob(".err") + glob("_AtomicTestErrors.txt")
            if "_AtomicTestErrors.txt" in "".join(logs):
                print p + " contains _AtomicTestErrors.txt"
                for e in [f for f in logs if f.endswith(".err")]:
                    if not os.path.getsize(e):
                        print "removing " + os.path.basename(e)
                        os.remove(e)
            else:
                for e in [f for f in logs if f.endswith(".err")]:
                    if not os.path.getsize(e):
                        print "removing " + os.path.basename(e) + " and " + os.path.splitext(e)[0] + ".out"
                        os.remove(e)
                        os.remove(os.path.splitext(e)[0] + ".out")

if args.simplify:
    simplify()

####################################################################
def clean():
    removals = [os.path.join(d[0], f) for d in os.walk(".") for f in d[2]
                if f.endswith(".out") or
                f.endswith(".err") or
                f == "_AtomicTestErrors.txt"]

if args.clean:
    clean()
