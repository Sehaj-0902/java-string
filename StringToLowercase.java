// Program to convert the complete text to lowercase and compare the results

import java.util.Scanner;

public class StringToLowercase {
	// convertToLowercase() method to convert string to lowercase
	public static String convertToLowercase(String string) {
        	StringBuilder lowercaseString = new StringBuilder();
        	for (int i = 0; i < string.length(); i++) {
            		char ch = string.charAt(i);
            		if (ch >= 'A' && ch <= 'Z') {
				// Convert uppercase to lowercase
                		ch = (char) (ch + 32);
            		}
            		lowercaseString.append(ch);
        	}
        	return lowercaseString.toString();
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

		// Call convertToLowercase() method and store it in the variable string1
		String string1 = convertToLowercase(string);

		// Convert string to lowercase using in-built toLowerCase() method
		String string2 = string.toLowerCase();

		System.out.println("Result using convertToLowercase() method: " + string1);
		System.out.println("Result using built-in toLowerCase() method: " + string2);

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
	String: "HELLO"
Output:
	Result using convertToLowercase() method: hello
	Result using built-in toLowerCase() method: hello
	The two strings are same
*/
