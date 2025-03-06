// Program to create a substring from a String using the charAt() method and using the String built-in method substring(), and compare them

import java.util.Scanner;

public class CompareSubstrings {
	// createSubstring() method to compare the strings
	public static String createSubstring(String string, int startIndex, int endIndex) {
		// Create substring from string
		String subString = "";
        	for (int i = startIndex; i < endIndex; i++) {
            		subString += string.charAt(i);
        	}
        	return subString;
	}

	public static boolean compareStrings(String subString1, String subString2) {
		if (subString1.length() != subString2.length()) {
            		return false;
        	}
		// Check if strings are equal
        	for (int i = 0; i < subString1.length(); i++) {
            		if (subString1.charAt(i) != subString2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String string = sc.next();

		System.out.print("Enter starting index: ");
		int startIndex = sc.nextInt();

		System.out.print("Enter ending index: ");
                int endIndex = sc.nextInt();

		// Call createSubstring() method and store it in the variable subString1
		String subString1 = createSubstring(string, startIndex, endIndex);

		// Create substring using built-in method
		String subString2 = string.substring(1,4);

		System.out.println("Result using createSubstring() method: " + subString1);
		System.out.println("Result using built-in substring() method: " + subString2);

		if (compareStrings(subString1, subString2)) {
			System.out.println("The two substrings are same");
		}
		else {
			System.out.println("The two substrings are not same");
		}
	}
}

/*
Input:
	String: "hello"
	startIndex: 1
	endIndex: 4
Output:
	Result using createSubstring() method: ell
	Result using built-in substring() method: ell
	The two substrings are same

Input:
        String1: "hello"
        startIndex: 1
        endIndex: 5
Output:
        Result using createSubtring() method: ello
        Result using built-in equals() method: ell
        The two substrings are not same
*/
