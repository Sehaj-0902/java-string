// Program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;

public class GenerateArrayIndexOutOfBoundsException {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	String[] names = {"Alice", "George", "Charlie", "John"};

		// Call generateException() method to generate exception
	        generateException(names);

		// Call handleException() method to handle exception
  		handleException(names);
    	}

	// generateException() method to generate GenerateArrayIndexOutOfBoundsException
    	public static void generateException(String[] names) {
        	try {
            		String name = names[names.length]; 
            		System.out.println("Name: " + name);
        	}
		catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("ArrayIndexOutOfBoundsException generated: " + e.getMessage());
        	}
    	}

	// handleException() method to handle GenerateArrayIndexOutOfBoundsException
    	public static void handleException(String[] names) {
        	try {
            		String name = names[names.length];
            		System.out.println("Name: " + name);
        	}
		catch (ArrayIndexOutOfBoundsException e) {
            		System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        	}
		catch (RuntimeException e) {
            		System.out.println("RuntimeException caught: " + e.getMessage());
        	}
    	}
}
