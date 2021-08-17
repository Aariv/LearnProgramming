package com.ariv.programiz.introduction;

public class _05_JavaOperators {

	public static void main(String[] args) {
		/**
		 * Java Operators
		 * 
		 * Operators are symbols that perform operations on variables and values. 
		 * For example, + is an operator used for addition, while * is also an operator used for multiplication.
		 * 
		 * Operators in Java can be classified into 5 types:
		 * 
		 *  Arithmetic Operators
		 *  Assignment Operators
		 *  Relational Operators
		 *  Logical Operators
		 *  Unary Operators
		 *  Bitwise Operators
		 *  
		 * 1. Java Arithmetic Operators
		 *  Arithmetic operators are used to perform arithmetic operations on variables and data. 
		 *  For example,
		 *  a + b;
		 */
		// declare variables
	    int a = 12, b = 5;
	    
	    // addition operator
	    System.out.println("a + b = " + (a + b));
	    
	    // subtraction operator
	    System.out.println("a - b = " + (a - b));
	    
	    // multiplication operator
	    System.out.println("a * b = " + (a * b));
	    
	    // division operator
	    System.out.println("a / b = " + (a / b));
	    
	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    /**
	     * / Division Operator
	     * % Modulo Operator
	     * 
	     * 2. Java Assignment Operators
	     * 
	     * Assignment operators are used in Java to assign values to variables. For example,
	     */
	    int age;
	    age = 5;
	    /**
	     * Here, = is the assignment operator. It assigns the value on its right to the variable on its left. 
	     * That is, 5 is assigned to the variable age.
	     * Let's see some more assignment operators available in Java.
	     * 
	     * =, a = b;
	     * +=, a += b;	
	     * -=, a -= b;
	     * *=, a *= b;
	     * /=, a /= b;
	     * %=, a %= b;
	     * 
	     */
	    /**
	     * 3. Java Relational Operators
	     * 
	     * Relational operators are used to check the relationship between two operands. For example,
	     * Here, > operator is the relational operator. It checks if a is less than b or not.
	     */
	    // check is a is less than b
	    if (a < b) {
	    	
	    }
	    /**
	     * ==, Is Equal To	
	     * !=, Not Equal To	
	     * >,  Greater Than	
	     * <,  Less Than
	     * >=, Greater Than or Equal To	
	     * <=, Less Than or Equal To
	     */
	    // create variables
	    int x = 7, y = 11;
	    // value of a and b
	    System.out.println("a is " + x + " and b is " + y);
	    // == operator
	    System.out.println(x == y);  // false

	    // != operator
	    System.out.println(x != y);  // true

	    // > operator
	    System.out.println(x > y);  // false

	    // < operator
	    System.out.println(x < y);  // true

	    // >= operator
	    System.out.println(x >= y);  // false

	    // <= operator
	    System.out.println(x <= y);  // true
	    
	    /**
	     * 4. Java Logical Operators
	     * 
	     * Logical operators are used to check whether an expression is true or false. 
	     * They are used in decision making.
	     * 
	     * && (Logical AND)	
	     * || (Logical OR)	
	     * ! (Logical NOT)	
	     */
	    
	    /**
	     * 5. Java Unary Operators
	     * 
	     * Unary operators are used with only one operand. 
	     * For example, ++ is a unary operator that increases the value of a variable by 1. 
	     * That is, ++5 will return 6.
	     * 
	     * + Unary plus: not necessary to use since numbers are positive without using it
	     * - Unary minus: inverts the sign of an expression
	     * ++ Increment operator: increments value by 1
	     * -- Decrement operator: decrements value by 1
	     * !  Logical complement operator: inverts the value of a boolean
	     * 
	     * Increment and Decrement Operators
	     * 
	     * Java also provides increment and decrement operators: ++ and -- respectively. ++ increases the value of the operand by 1, while -- decrease it by 1. For example,
	     */
	    int num = 5;
	    // increase num by 1
	    ++num;
	    // Here, the value of num gets increased to 6 from its initial value of 5.
	    /**
	     * 6. Java Bitwise Operators
	     * 
	     * Bitwise operators in Java are used to perform operations on individual bits. For example,
	     * Here, ~ is a bitwise operator. It inverts the value of each bit (0 to 1 and 1 to 0).
	     * 
	     * ~ 	Bitwise Complement,
	     * <<	Left Shift
	     * >>	Right Shift
	     * >>>	Unsigned Right Shift
	     * &	Bitwise AND
	     * ^	Bitwise exclusive OR
	     */
	    
	    /**
	     * Other Operators
	     * 
	     * Java instanceof Operator
	     * 
	     * The instanceof operator checks whether an object is an instanceof a particular class. For example,
	     * 
	     */
	    String str = "Programiz";
	    boolean result;
	    
	    // checks if str is an instance of
	    // the String class
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result);
	    
	    /**
	     * Java Ternary Operator
	     * 
	     * The ternary operator (conditional operator) is shorthand for the if-then-else statement. For example,
	     * 
	     */
	    
	    int februaryDays = 29;
	    String result1;
	    
	    // ternary operator
	    result1 = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(result1);
	}
}
