// Program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;

public class CompareStrings {
	// compareString() method to compare the strings
	public static boolean compareString(String string1, String string2) {
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

		System.out.print("Enter String1: ");
		String string1 = sc.next();

		System.out.print("Enter String2: ");
		String string2 = sc.next();

		boolean isEqual = string1.equals(string2);
		// Call compareString() method and store it in the variable compare
		boolean compare = compareString(string1, string2);

		System.out.println("Result using compareString() method: " + compare);
		System.out.println("Result using built-in equals() method: " + isEqual);

		if (isEqual == compare) {
			System.out.println("The results are same");
		}
		else {
			System.out.println("The results are not same");
		}
	}
}

/*
Input:
	String1: "hello"
	String2: "world"
Output:
	Result using compareString() method: false
	Result using built-in equals() method: false
	The results are not same

Input:
        String1: "hello"
        String2: "hello"
Output:
        Result using compareString() method: true
        Result using built-in equals() method: true
        The results are same
*/

