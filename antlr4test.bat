@echo off
SET CLASSPATH=.;./antlr-4.8-complete.jar;%CLASSPATH%

REM echo Generating java parser
REM java org.antlr.v4.Tool Test.g4

REM echo Compiling parser
REM javac --release 8 *.java

echo Generating graphics
java org.antlr.v4.gui.TestRig target.generated.Test s -gui < input.txt

echo Clearing generated files
./clear.bat