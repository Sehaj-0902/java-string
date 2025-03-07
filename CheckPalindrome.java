// Program to to check if a text is palindrome and display the result

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.next();

		if(isPalindromeIterative(string) || isPalindromeRecursive(string, 0, string.length()-1) || isPalindromeCharArray(string)) {
			if (isPalindromeIterative(string)) {
				System.out.println("The result using iterative method: " + isPalindromeIterative(string));
			}
			if(isPalindromeRecursive(string, 0, string.length()-1)) {
                        	System.out.println("The result using recursive method: " + isPalindromeRecursive(string, 0, string.length()-1));
                	}
			if(isPalindromeCharArray(string)) {
                        	System.out.println("The result using toCharArray() method: " + isPalindromeCharArray(string));
                	}
		}
		else {
                        System.out.println("The string is not Palindrome");
                }
	}

	// isPalindromeIterative() method to check if a string is palindrome iteratively
    	public static boolean isPalindromeIterative(String string) {
        	string = string.replaceAll("\\s", "").toLowerCase();
        	int startIndex = 0;
        	int endIndex = string.length() - 1;

        	while (startIndex < endIndex) {
            		if (string.charAt(startIndex) != string.charAt(endIndex)) {
                		return false;
            		}
            		startIndex++;
            		endIndex--;
        	}
        	return true;
    	}

    	// isPalindromeRecursive() method to check if a string is palindrome recursively
    	public static boolean isPalindromeRecursive(String string, int startIndex, int endIndex) {
        	string = string.replaceAll("\\s", "").toLowerCase();
        	if (startIndex >= endIndex) {
            		return true;
        	}
        	if (string.charAt(startIndex) != string.charAt(endIndex)) {
            		return false;
        	}
        	return isPalindromeRecursive(string, startIndex + 1, endIndex - 1);
    	}

    	// reverseString() method to reverse a string using charAt() method
    	public static String reverseString(String string) {
        	StringBuilder reversedStringArray = new StringBuilder();
        	for (int i = string.length() - 1; i >= 0; i--) {
            		reversedStringArray.append(string.charAt(i));
        	}
        	return reversedStringArray.toString();
    	}

	// isPalindromeCharArray() method to reverse a string using toCharArray() method
    	public static boolean isPalindromeCharArray(String string) {
		char[] charArray = string.toCharArray();
        	char[] reversedCharArray = new char[charArray.length];

        	for (int i = 0; i < charArray.length; i++) {
            		reversedCharArray[i] = charArray[charArray.length - 1 - i];
        	}

        	for (int i = 0; i < charArray.length; i++) {
            		if (charArray[i] != reversedCharArray[i]) {
                		return false;
            		}
        	}
        	return true;
    	}
}

/*
Input:
	String: "abba"
Output:
	The result using iterative method: true
	The result using recursive method: true
	The result using toCharArray() method: true

Input:
	String: "hello"
Output:
	The string is not Palindrome
*/
