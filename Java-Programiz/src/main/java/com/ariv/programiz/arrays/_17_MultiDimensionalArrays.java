package com.ariv.programiz.arrays;

public class _17_MultiDimensionalArrays {

	public static void main(String[] args) {
		/**
		 * Java Multidimensional Arrays
		 * 
		 * A multidimensional array is an array of arrays. Each element of a multidimensional array is an array itself. For example,
		 */
		int[][] a = new int[3][4];
		/**
		 * Here, we have created a multidimensional array named a. 
		 * It is a 2-dimensional array, that can hold a maximum of 12 elements,
		 * 
		 * Remember, Java uses zero-based indexing, that is, indexing of arrays in Java starts with 0 and not 1.
		 * 
		 * Let's take another example of the multidimensional array. 
		 * This time we will be creating a 3-dimensional array. For example,
		 */
		String[][][] data = new String[3][4][2];
		/**
		 * How to initialize a 2d array in Java?
		 */
		int[][] ab = { 
				{ 1, 2, 3 },
				{ 4, 5, 6, 9 },
				{ 7 },
		};
		// calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
	}
	
}
