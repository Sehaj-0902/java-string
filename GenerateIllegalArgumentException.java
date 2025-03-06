// Program to demonstrate IllegalArgumentException

import java.util.Scanner;

public class GenerateIllegalArgumentException {
    	public static void main(String[] args) {
        	String name = null;

        	// Call generateException() method to generate exception
	       	generateException(name);

        	// Call handleException() method to handle exception
        	handleException(name);
	}

	// validateString() method to check if the string is null or empty
	public static void validateString(String string) {
        	if (string == null || string.trim().isEmpty()) {
            		throw new IllegalArgumentException("Input string must not be null or empty.");
        	}
    	}

    	// generateException() method to generate IllegalArgumentException
    	public static void generateException(String string) {
   		try {
            		validateString(string);
            		System.out.println("String is valid: " + string);
        	}
		catch (IllegalArgumentException e) {
            		System.out.println("IllegalArgumentException generated: " + e.getMessage());
        	}
    	}

    	// handleException() method to handle IllegalArgumentException
    	public static void handleException(String string) {
        	try {
            		validateString(string);
            		System.out.println("String is valid: " + string); 
        	}
		catch (IllegalArgumentException e) {
            		System.out.println("IllegalArgumentException caught: " + e.getMessage());
        	}
		catch (RuntimeException e) {
            		System.out.println("RuntimeException caught: " + e.getMessage());
        	}
    	}
}
