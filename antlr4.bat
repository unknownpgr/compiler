@echo off
SET CLASSPATH=.;./antlr-4.8-complete.jar;%CLASSPATH%
java org.antlr.v4.Tool %*