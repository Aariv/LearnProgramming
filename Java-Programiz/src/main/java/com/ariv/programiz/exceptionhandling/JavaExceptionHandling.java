package com.ariv.programiz.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaExceptionHandling {

	public static void main(String[] args) {
		//1. Try - Catch
		try {
			int divideByZero = 5 / 0;
			System.out.println("Hello");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception" + e.getMessage());
			// 2. Try - catch - finally
		} finally {
			System.out.println("Execute me always");
		}
		
		//divideByZero();
		
		try {
			findFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 3. Java Throw - Throws
	public static void divideByZero() {
		throw new ArithmeticException();
	}
	
	// throws
	public static void findFile() throws IOException {
		File newFile = new File("Test.txt");
		FileInputStream fis = new FileInputStream(newFile);
	}
}
