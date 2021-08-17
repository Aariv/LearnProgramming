package com.ariv.programiz.introduction;

public class _07_JavaExpressionsBlocks {

	public static void main(String[] args) {
		/**
		 * Java Expressions
		 * 
		 * A Java expression consists of variables, operators, literals, and method calls. To know more about method calls, visit Java methods. For example,
		 */
		int score; 
		score = 90;
		
		Double a = 2.2, b = 3.4, result;
		result = a + b - 3.4;
		// Here, a + b - 3.4 is an expression.
		
		/**
		 * Java Statements
		 * 
		 * In Java, each statement is a complete unit of execution. For example,
		 * 
		 * int score = 9*5;
		 * 
		 * Expression statements
		 * 
		 * We can convert an expression into a statement by terminating the expression with a ;. 
		 * These are known as expression statements. For example,
		 */
		// expression
		//number = 10
		// statement
		//number = 10;
		/**
		 * Declaration Statements
		 * 
		 * In Java, declaration statements are used for declaring variables. For example,
		 * 
		 */
		Double tax = 9.5;
		/**
		 * Java Blocks
		 * 
		 * A block is a group of statements (zero or more) that is enclosed in curly braces { }. For example,
		 * 
		 */
		String band = "Beatles";
    	
        if (band == "Beatles") { // start of block
            System.out.print("Hey ");
            System.out.print("Jude!");
        } // end of block
	}
}
