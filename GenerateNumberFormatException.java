// Program to demonstrate NumberFormatException

import java.util.Scanner;

public class GenerateNumberFormatException {
	    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.next();

		// Call generateException() method to generate exception
	        generateException(string);

		// Call handleException() method to handle exception
        	handleException(string);
    	}

	// generateException() method to generate NumberFormatException
    	public static void generateException(String text) {
        	try {
            		int number = Integer.parseInt(text);
            		System.out.println("Number: " + number);
        	}
		catch (NumberFormatException e) {
            		System.out.println("NumberFormatException generated: " + e.getMessage());
        	}
    	}

	// handleException() method to handle NumberFormatException
    	public static void handleException(String text) {
        	try {
            		int number = Integer.parseInt(text);
            		System.out.println("Number: " + number);
        	}
		catch (NumberFormatException e) {
            		System.out.println("NumberFormatException caught: " + e.getMessage());
        	}
		catch (RuntimeException e) {
            		System.out.println("RuntimeException caught: " + e.getMessage());
        	}
    	}
}
