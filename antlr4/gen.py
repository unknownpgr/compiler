import sys
from antlr4 import *
from TestLexer import TestLexer
from TestParser import TestParser


input_stream = FileStream('input.txt')
lexer = TestLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = TestParser(stream)
tree = parser.s()
print(tree.toStringTree(recog=parser))
