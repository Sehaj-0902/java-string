// Program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;

public class GenerateStringIndexOutOfBoundsException {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.next();

		// Call generateException() method to generate exception
		generateException(string);

		// Call handleException() method to handle exception
        	handleException(string);
    	}

    	// generateException() method to generate StringIndexOutOfBoundsException
    	public static void generateException(String string) {
        	char ch = string.charAt(string.length());
        	System.out.println("Character: " + ch);
    	}

    	// handleException() method to handle StringIndexOutOfBoundsException
    	public static void handleException(String string) {
        	try {
            		char ch = string.charAt(string.length());
            		System.out.println("Character: " + ch);
        	}
		catch (StringIndexOutOfBoundsException e) {
            		System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        	}
 	}
}





