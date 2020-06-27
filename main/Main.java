package main;

import java.io.File;
import java.io.FileWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import target.generated.TestLexer;
import target.generated.TestParser;
import target.generated.TestParser.SContext;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream cs = CharStreams.fromFileName("./input.txt");
//		System.out.println("Raw source code : \n" + cs);
		TestLexer ler = new TestLexer(cs);
		CommonTokenStream commonTokenStream = new CommonTokenStream(ler);
		TestParser pser = new TestParser(commonTokenStream);
		SContext context = pser.s();
		HackListener hl = new HackListener();
		ParseTreeWalker.DEFAULT.walk(hl, context);
		String asm = hl.getGeneratedCode();
		System.out.println("-----------------");
		System.out.println("Generated asm : ");
//		System.out.println(asm);

		try (FileWriter fw = new FileWriter(new File("gen.asm"))) {
			fw.write(asm);
		}
		System.out.println("Generated");
	}
}
