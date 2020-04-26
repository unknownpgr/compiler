@echo off
echo Setting classpath
SET CLASSPATH=.;C:\JavaLib\antlr-4.8-complete.jar;%CLASSPATH%
echo Generating java parser
java org.antlr.v4.Tool -Dlanguage=Java Test.g4
echo Compiling parser
javac --release 8 *.java
echo Generating graphics
grun Test s -gui < input.txt