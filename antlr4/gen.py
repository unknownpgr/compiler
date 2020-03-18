import sys
from antlr4 import *
from TestLexer import TestLexer
from TestParser import TestParser


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = TestLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = TestParser(stream)
    tree = parser.r()
    print(tree.toStringTree(recog=parser))


if __name__ == '__main__':
    main(sys.argv)
