@echo off
@runner.bat %*
@if ERRORLEVEL 1 (
    echo.
    echo ======================================================
    echo This 'run' command is part of the tools used to create
    echo these solutions. You can ignore it.
    echo ======================================================
)
