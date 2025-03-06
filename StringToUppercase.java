// Program to convert the complete text to uppercase and compare the results

import java.util.Scanner;

public class StringToUppercase {
	// convertToUppercase() method to convert string to uppercase
	public static String convertToUppercase(String string) {
        	StringBuilder uppercaseString = new StringBuilder();
        	for (int i = 0; i < string.length(); i++) {
            		char ch = string.charAt(i);
            		if (ch >= 'a' && ch <= 'z') {
				// Convert lowercase to uppercase
                		ch = (char) (ch - 32);
            		}
            		uppercaseString.append(ch);
        	}
        	return uppercaseString.toString();
    	}

	// compareStrings() method to compare the strings
	public static boolean compareStrings(String string1, String string2) {
		if (string1.length() != string2.length()) {
            		return false;
        	}
		// Check if strings are equal
        	for (int i = 0; i < string1.length(); i++) {
            		if (string1.charAt(i) != string2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String string = sc.nextLine();

		// Call convertToUppercase() method and store it in the variable string1
		String string1 = convertToUppercase(string);

		// Convert string to uppercase using in-built toUpperCase() method
		String string2 = string.toUpperCase();

		System.out.println("Result using convertToUppercase() method: " + string1);
		System.out.println("Result using built-in toUpperCase() method: " + string2);

		if (compareStrings(string1, string2)) {
			System.out.println("The two strings are same");
		}
		else {
			System.out.println("The two strings are not same");
		}
	}
}

/*
Input:
	String: "Hello"
Output:
	Result using convertToUppercase() method: HELLO
	Result using built-in toUpperCase() method: HELLO
	The two strings are same
*/
