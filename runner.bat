@setlocal enabledelayedexpansion && python -x "%~f0" %* & exit /b !ERRORLEVEL!
#start python code here (tested on Python 2.7.4)
# Run all solution scripts and capture any errors
import os, sys

from glob import glob
paths = [os.path.join('.', p[0:-1]) for p in glob('*/')]
for p in paths:
    print p
    os.chdir(p)
    for n in glob('Solution-*.scala'):
        base = n.rsplit('.')[0]
        cmd = "scala " + n + " > " + base + ".out 2> " + base + ".err"
        print "    " + cmd
        os.system(cmd)
    os.chdir("..")
