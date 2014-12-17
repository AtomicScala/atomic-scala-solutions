@setlocal enabledelayedexpansion && py.exe -x "%~f0" %* & exit /b !ERRORLEVEL!
import sys, os
from solutionDirs import solutionDirs
from contextlib import contextmanager

run_bat = """\
@echo off
setlocal enabledelayedexpansion
set CLASSPATH={}.;..;..\libs\commons-math3-3.3.jar;
:: echo CLASSPATH is [!CLASSPATH!]
{} %*
if ERRORLEVEL 1 (
    echo.
    echo ======================================================
    echo This 'run' command is part of the tools used to create
    echo and test these solutions. You can ignore it.
    echo ======================================================
)
"""

@contextmanager
def visitDir(d):
    old = os.getcwd()
    os.chdir(d)
    yield d
    os.chdir(old)

with visitDir('..'):
    for dirname in solutionDirs:
        with visitDir(dirname):
            with file("run.bat", 'w') as f:
                f.write(run_bat.format(r"%~dp0..\;", r"..\ZZZ_BuildTools\runner.bat"))
    # Root directory has a different path:
    with file("run.bat", 'w') as f:
        f.write(run_bat.format(r"%~dp0;", r"ZZZ_BuildTools\runner.bat"))
