package com.ariv.programiz.introduction;

import java.util.Scanner;

public class _06_JavaIO {

	public static void main(String[] args) {
		/**
		 * Java Basic Input and Output
		 * 
		 * Java Output
		 */
		System.out.println(); // or
		//System.out.print(); // or
		//System.out.printf();
		
		/**
		 * System is a class
		 * out is a public static field: it accepts output data.
		 * 
		 * Difference between println(), print() and printf()
		 * print() - It prints string inside the quotes.
		 * println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
		 * printf() - It provides string formatting (similar to printf in C/C++ programming).
		 */
		
		/**
		 * Java Input
		 * 
		 * Java provides different ways to get input from the user. 
		 * However, in this tutorial, you will learn to get input from user using the object of Scanner class.
		 * 
		 * In order to use the object of Scanner, we need to import java.util.Scanner package.
		 */
		// create an object of Scanner
		Scanner input = new Scanner(System.in);
		// take input from the user
		int number = input.nextInt();
		System.out.println(number);
		input.close();
	}

}
