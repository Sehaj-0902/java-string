// Program to check if a given string is a palindrome

import java.util.Scanner;

public class CheckPalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.next();

		if(isPalindrome(string)) {
			System.out.println("The string is Palindrome");
		}
		else {
			System.out.println("The string is not Palindrome");
		}
	}

	// isPalindrome() method to check if a string is palindrome
	public static boolean isPalindrome(String string) {
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
}

/*
Input:
	String: "aba"
Output:
	The string is Palindrome

Input:
	String: "hello:
Output:
	The string is not Palindrome
*/
