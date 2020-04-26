@echo off
SET CLASSPATH=.;./antlr-4.8-complete.jar;%CLASSPATH%
echo Generating java parser
java org.antlr.v4.Tool Test.g4
echo Compiling parser
javac --release 8 *.java
echo Generating graphics
java org.antlr.v4.gui.TestRig Test s -gui < input.txt
del *.java
del *.class