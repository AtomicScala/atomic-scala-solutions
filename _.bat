@echo off
start /I "atomic scala solutions" run.bat
if ERRORLEVEL 1 (
    echo.
    echo =================================================
    echo This command is part of the tools used to create
    echo and test these solutions. You can ignore it.
    echo =================================================
)
