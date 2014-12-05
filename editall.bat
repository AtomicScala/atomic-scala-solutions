@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
## Look for \xc3 in all files and clean up
import os, sys, shutil
from contextlib import contextmanager
from glob import glob

@contextmanager
def visitDir(d):
    os.chdir(d)
    yield d
    os.chdir("..")

paths = [os.path.join('.', p[0:-1]) for p in glob('*/')]

for p in paths:
    print p
    with visitDir(p):
        for n in glob('*.scala'):
            print "    " + n
            contents = file(n).read()
            if '\xc3' in contents:
                print 'xc3'