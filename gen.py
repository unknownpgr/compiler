import sys
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from TestLexer import TestLexer
from TestParser import TestParser
from TestVisitor import TestVisitor

input_stream = FileStream('./input.txt')
lexer = TestLexer(input_stream)
stream = CommonTokenStream(lexer)
parser = TestParser(stream)
tree = parser.s()
print(tree.toStringTree(recog=parser))
