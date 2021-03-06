package main;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import autogenerated.*;
import walker.MyVisitor;

public class Main {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		// create a lexer that feeds off of input CharStream
		ProjetoLexer lexer = new ProjetoLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		ProjetoParser parser = new ProjetoParser(tokens);
		ParseTree tree = parser.pgm( ); // begin parsing at init rule

		// create the visitor
		MyVisitor visitor = new MyVisitor( );
		// visit the tree created by the parser
		visitor.visit(tree);
	}
}