// Program to find and return the length of a string without using the length() method

import java.util.Scanner;

public class FindStringLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.next();

		// Call getStringLength() method to get string length
		int length1 = getStringLength(string);

		// Get string length using in-built length() method
		int length2 = string.length();

		// Print the results
        	System.out.println("The length using getStringLength() method after handling the exception: " + length1);
        	System.out.println("The length using built-in length() method: " + length2);
	}

	public static int getStringLength(String string) {
		int count = 0;

		try {
			// Infinite while loop to count
			while(true) {
				string.charAt(count++);
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
		}
		return count - 1;
	}

}
