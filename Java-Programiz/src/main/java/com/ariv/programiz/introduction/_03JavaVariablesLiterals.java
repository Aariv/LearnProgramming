package com.ariv.programiz.introduction;

public class _03JavaVariablesLiterals {

	public static void main(String[] args) {
		/**
		 * Java Variables:
		 *  A variable is a location in memory (storage area) to hold data.
		 *  
		 * Create Variables in Java
		 */
		int speedLimit = 80;
		/**
		 * Here, speedLimit is a variable of int data type and we have assigned value 80 to it.
		 * 
		 * Change values of variables
		 */
		speedLimit = 90; 
		/**
		 * What is the variable scope?
		 * 
		 * Rules for Naming Variables in Java
		 * 
		 * Java is case sensitive. Hence, age and AGE are two different variables. For example,
		 */
		int age = 24;
		int AGE = 25;
		/**
		 * Variables must start with either a letter or an underscore, _ or a dollar, $ sign. For example,
		 */
		int age1;  // valid name and good practice
		int _age;  // valid but bad practice
		int $age;  // valid but bad practice
		/**
		 * Variable names cannot start with numbers. For example,
		 */
		//int 1age;  // invalid variables
		/**
		 * Variable names can't use whitespace. For example,
		 */
		//int my age;  // invalid variables
		/**
		 * When creating variables, choose a name that makes sense. 
		 * For example, score, number, level makes more sense than variable names such as s, n, and l.
		 */
		
		/**
		 * There are 4 types of variables in Java programming language:
		 * 	Instance Variables (Non-Static Fields)
		 * 	Class Variables (Static Fields)
		 * 	Local Variables
		 * 	Parameters
		 */
		
		/**
		 * Java literals
		 * 	Literals are data used for representing fixed values. 
		 *  They can be used directly in the code. For example,
		 */
		int a = 1;
		float b = 2.5f;
		char c = 'F';
		/**
		 * Here are different types of literals in Java.
		 * 
		 * 1. Boolean Literals
		 */
		boolean flag1 = false;
		boolean flag2 = true;
		/**
		 * 2. Integer Literals
		 * 
		 * An integer literal is a numeric value(associated with numbers) without any fractional or exponential part. 
		 * There are 4 types of integer literals in Java:
		 * 
		 * binary (base 2)
		 * decimal (base 10)
		 * octal (base 8)
		 * hexadecimal (base 16)
		 */
		// binary
		int binaryNumber = 0b10010;
		// octal 
		int octalNumber = 027;
		// decimal
		int decNumber = 34;
		// hexadecimal 
		int hexNumber = 0x2F; // 0x represents hexadecimal
		// binary
		int binNumber = 0b10010; // 0b represents binary
		/**
		 * In Java, binary starts with 0b, octal starts with 0, and hexadecimal starts with 0x.
		 * 
		 * 3. Floating-point Literals
		 * 
		 * A floating-point literal is a numeric literal that has either a fractional form or an exponential form. 
		 * For example,
		 */
		double myDouble = 3.4;
	    float myFloat = 3.4F;
	    // 3.445*10^2
	    double myDoubleScientific = 3.445e2;
	    /**
	     * 4. Character Literals
	     * Character literals are unicode character enclosed inside single quotes. For example,
	     */
	    char letter = 'a';
	    /**
	     * Here, a is the character literal.
	     * We can also use escape sequences as character literals. 
	     * For example, \b (backspace), \t (tab), \n (new line), etc.
	     * 
	     * 5. String literals
	     * A string literal is a sequence of characters enclosed inside double-quotes. 
	     * For example,
	     */
	    String str1 = "Java Programming";
	    String str2 = "Programiz";

	}

}
