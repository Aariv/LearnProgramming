package com.ariv.programiz.exceptionhandling;

public class JavaTryCatch {
	public int[] arr = new int[10];
	public static void main(String[] args) {
		try {
			//System.exit(0); // finally won't be called.
			int dvZero = 5 / 0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finaly block is always executed");
		} 
		
		// multiple catch block
		
		JavaTryCatch jcatch = new JavaTryCatch();
		jcatch.writeList();
		
	}
	
	public void writeList() {
	    try {
	      arr[10] = 11;
	    }
	    /**
	    catch (NumberFormatException e1) {
	      System.out.println("NumberFormatException => " + e1.getMessage());
	    }
	    catch (IndexOutOfBoundsException e2) {
	      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
	    }*/
	    
	    catch (NumberFormatException | IndexOutOfBoundsException e2) {
		      System.out.println("NumberFormatException => " + e2.getMessage());
		    }
	}
}
