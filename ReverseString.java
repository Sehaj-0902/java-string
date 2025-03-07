// Program to reverse a given string without using any built-in reverse functions

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.nextLine();

		System.out.println("String before reversing: " + string);
		System.out.println("String after reversing: " + reverseString(string));
	}

	// reverseString() method to reverse a string without using in-built methods
	public static String reverseString(String string) {
        	String reversedString = "";
        	for (int i = string.length() - 1; i >= 0; i--) {
            		reversedString += string.charAt(i);
        	}
		return reversedString;
      	}
}

/*
Input:
	String: "hello"
Output:
	String before reversing: hello
	String after reversing: olleh
*/
