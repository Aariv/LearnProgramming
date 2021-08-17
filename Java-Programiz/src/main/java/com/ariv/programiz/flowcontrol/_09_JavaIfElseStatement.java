package com.ariv.programiz.flowcontrol;

public class _09_JavaIfElseStatement {

	public static void main(String[] args) {
		/**
		 * 1. Java if (if-then) Statement
		 * 
		 * Here, condition is a boolean expression such as age >= 18.
		 * if condition evaluates to true, statements are executed
		 * if condition evaluates to false, statements are skipped
		 */
		
		/**
		 * 2. Java if...else (if-then-else) Statement
		 * 
		 * The if statement executes a certain section of code if the test expression is evaluated to true. 
		 * However, if the test expression is evaluated to false, it does nothing.
		 */
		/*
			if (condition) {
				// codes in if block
			} else {
				// codes in else block
			}
		*/
		
		/**
		 * 3. Java if...else...if Statement
		 * 
		 * In Java, we have an if...else...if ladder, that can be used to execute one block of code among multiple other blocks.
		 * 
		 */
		/*
			if (condition1) {
				// codes
			} else if (condition2) {
				// codes
			} else if (condition3) {
				// codes
			} else {
				// codes
			}
		*/
		/**
		 * 4. Java Nested if..else Statement
		 * 
		 * In Java, it is also possible to use if..else statements inside an if...else statement. 
		 * It's called the nested if...else statement.
		 */
		// declaring double type variables
	    Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largest;
	    // checks if n1 is greater than or equal to n2
	    if (n1 >= n2) {
			// if...else statement inside the if block
			// checks if n1 is greater than or equal to n3
			if (n1 >= n3) {
				largest = n1;
			}

			else {
				largest = n3;
			}
		} else {

			// if..else statement inside else block
			// checks if n2 is greater than or equal to n3
			if (n2 >= n3) {
				largest = n2;
			}

			else {
				largest = n3;
			}
		}

	}
}
