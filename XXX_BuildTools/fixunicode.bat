@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
# -*- coding: utf-8 -*-
## Look for Â \xc3 in all files and clean up
# http://blog.luminoso.com/2012/08/20/fix-unicode-mistakes-with-python/
import os, sys, shutil
from contextlib import contextmanager
from glob import glob
from ftfy import fix_file
from pprint import pprint

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)

paths = [os.path.join('.', p[0:-1]) for p in glob('*/')]
# Testing:
# paths = ['C:\\Users\\Bruce\\Documents\\GitHub\\atomic-scala-solutions\\Sequences']

for p in paths:
    print p
    with visitDir(p):
        for n in glob('*.scala'):
            print "    " + n
            with file(n) as unfixed:
                fixed = "".join(fix_file(unfixed))
            file(n, 'w').write(fixed.replace(u'\xc2', ''))
