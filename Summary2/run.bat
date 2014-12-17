@echo off
setlocal enabledelayedexpansion
set CLASSPATH=%~dp0..\;.;..;..\libs\commons-math3-3.3.jar;
:: echo CLASSPATH is [!CLASSPATH!]
..\ZZZ_BuildTools\runner.bat %*
if ERRORLEVEL 1 (
    echo.
    echo ======================================================
    echo This 'run' command is part of the tools used to create
    echo and test these solutions. You can ignore it.
    echo ======================================================
)
