package com.ariv.programiz.arrays;

public class _16_JavaArrays {

	public static void main(String[] args) {
		/**
		 * An array is a collection of similar types of data.
		 * 
		 * For example, if we want to store the names of 100 people then we can create an array of the string type that can store 100 names.
		 * 
		 */
		String[] array = new String[100];
		/**
		 * the above array cannot store more than 100 names. The number of values in a Java array is always fixed.
		 * 
		 * How to declare an array in Java?
		 * 
		 * dataType[] arrayName;
		 * 	dataType - it can be primitive data types like int, char, double, byte, etc. or Java objects
		 * 	arrayName - it is an identifier
		 */
		double[] data;
		/**
		 * Here, data is an array that can hold values of type double.
		 * But, how many elements can array this hold?
		 */
		// allocate memory
		data = new double[10]; // the array can store 10 elements. We can also say that the size or length of the array is 10.
		/**
		 * How to Initialize Arrays in Java?
		 */
		//declare and initialize and array
		int[] age = {12, 4, 5, 2, 5};
		/**
		 * Here, we have created an array named age and initialized it with the values inside the curly brackets.
		 */
		
		/**
		 * How to Access Elements of an Array in Java?
		 * 
		 * // access array elements
		 * array[index]
		 */

		// access each array elements
		System.out.println("Accessing Elements of Array:");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);
		
		/**
		 * Looping Through Array Elements
		 */
		// loop through the array
		// using for loop
		System.out.println("Using for Loop:");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

		// loop through the array
		// using for loop
		System.out.println("Using for-each Loop:");
		for (int a : age) {
			System.out.println(a);
		}
		
		// Compute Sum and Average of Array Elements
		
		// Multidimensional Arrays
		double[][] matrix = {
				{1.2, 4.3, 4.0}, 
			    {4.1, -1.1}
		};
		
	}
}
