@echo off
cd /d "%~dp0"
"%~dp0jre\bin\java.exe" -jar "%~dp0Windows10Calculator.jar"
if %errorlevel% neq 0 pause
