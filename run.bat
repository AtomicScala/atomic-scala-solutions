@echo off
ZZZ_BuildTools\runner.bat %*
if ERRORLEVEL 1 (
    echo.
    echo ======================================================
    echo This 'run' command is part of the tools used to create
    echo and test these solutions. You can ignore it.
    echo ======================================================
)
