package com.ariv.programiz.introduction;

public class _04Java_DataTypes {

	public static void main(String[] args) {
		/**
		 * Java Data Types
		 * 
		 * As the name suggests, data types specify the type of data that can be stored inside variables in Java.
		 * 
		 * Java is a statically-typed language. 
		 * This means that all variables must be declared before they can be used.
		 */
		int speed;
		/**
		 * Here, speed is a variable, and the data type of the variable is int.
		 * The int data type determines that the speed variable can only contain integers.
		 * 
		 * 8 Primitive Data Types
		 * 
		 * 1. boolean type
		 * 
		 * The boolean data type has two possible values, either true or false.
		 * Default value: false.
		 * They are usually used for true/false conditions.
		 */
		boolean flag = true;
	    System.out.println(flag);    // prints true
	    /**
	     * 2. byte type
	     * 
	     * The byte data type can have values from -128 to 127 (8-bit signed two's complement integer).
	     * If it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
	     * Default value: 0
	     */
	    byte range;
	    range = 124;
	    System.out.println(range);    // prints 124
	    /**
	     * 3. short type
	     * 
	     * The short data type in Java can have values from -32768 to 32767 (16-bit signed two's complement integer).
	     * If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
	     * Default value: 0
	     */
	    short temperature;
	    temperature = -200;
	    System.out.println(temperature);  // prints -200
	    /**
	     * 4. int type
	     * The int data type can have values from -231 to 231-1 (32-bit signed two's complement integer).
	     * If you are using Java 8 or later, you can use an unsigned 32-bit integer. 
	     * This will have a minimum value of 0 and a maximum value of 232-1. 
	     * To learn more, visit How to use the unsigned integer in java 8?
	     */
	    int range2 = -4250000;
	    System.out.println(range2);  // print -4250000
	    /**
	     * 5. long type
	     * 
	     * The long data type can have values from -263 to 263-1 (64-bit signed two's complement integer).
	     * If you are using Java 8 or later, you can use an unsigned 64-bit integer with a minimum value of 0 and a maximum value of 264-1.
	     * Default value: 0
	     */
	    long range3 = -42332200000L;
	    System.out.println(range3);    // prints -42332200000
	    /**
	     * 6. double type
	     * 
	     * The double data type is a double-precision 64-bit floating-point.
	     * It should never be used for precise values such as currency.
	     * Default value: 0.0 (0.0d)
	     */
	    double number = -42.3;
	    System.out.println(number);  // prints -42.3
	    /**
	     * 7. float type
	     * 
	     * The float data type is a single-precision 32-bit floating-point.
	     * Learn more about single-precision and double-precision floating-point if you are interested.
	     * It should never be used for precise values such as currency.
	     */
	    float number3 = -42.3f;
	    System.out.println(number3);  // prints -42.3
	    /**
	     * 8. char type
	     * 
	     * It's a 16-bit Unicode character.
	     * The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
	     * Default value: '\u0000'
	     */
	    char letter = '\u0051';
	    System.out.println(letter);  // prints Q
	    /**
	     * String type
	     */
	}
}
