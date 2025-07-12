@echo off
setlocal enabledelayedexpansion

:: Check if file path is provided
if "%~1"=="" (
    echo Error: No Java file specified
    exit /b 1
)

set "javaFile=%~1"

:: Check if the Java file exists
if not exist "%javaFile%" (
    echo Error: File "%javaFile%" not found
    exit /b 1
)

:: Create necessary directories if they don't exist
if not exist "OUT" mkdir OUT
if not exist "IO" mkdir IO
if not exist "IO\input.txt" echo. > "IO\input.txt"
if not exist "IO\output.txt" echo. > "IO\output.txt"

:: Extract package name from the Java file
set "packageName="
for /f "tokens=2 delims= " %%a in ('findstr /b /c:"package " "%javaFile%"') do (
    set "packageName=%%a"
    :: Remove semicolon from package name
    set "packageName=!packageName:~0,-1!"
)

:: Get the class name (filename without extension)
for %%f in ("%javaFile%") do set "className=%%~nf"

echo Compiling %javaFile%...
echo Package: %packageName%
echo Class: %className%

:: Compile the Java file
javac -d OUT "%javaFile%"
if errorlevel 1 (
    echo Compilation failed!
    exit /b 1
)

echo Compilation successful!

:: Run the Java program
if "%packageName%"=="" (
    echo Running: java -cp OUT %className%
    java -cp OUT %className% < "IO\input.txt" > "IO\output.txt"
) else (
    echo Running: java -cp OUT %packageName%.%className%
    java -cp OUT %packageName%.%className% < "IO\input.txt" > "IO\output.txt"
)

if errorlevel 1 (
    echo Execution failed!
    exit /b 1
)

echo Execution completed! Check IO\output.txt for results.
