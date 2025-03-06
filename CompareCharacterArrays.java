// Program to return all the characters in a string using the user-defined method and using the String built-in toCharArray() method, and compare them

import java.util.Scanner;
import java.util.Arrays;

public class CompareCharacterArrays {
	// getCharacters() method to print all characters in a string
	public static char[] getCharacters(String string) {
		char[] characters = new char[string.length()];
        	for (int i = 0; i < string.length(); i++) {
            		characters[i] += string.charAt(i);
        	}
        	return characters;
	}

	// compareCharArrays() method to compare the arrays
	public static boolean compareCharArrays(char[] array1, char[] array2) {
        	if (array1.length != array2.length) {
            		return false;
        	}
        	for (int i = 0; i < array1.length; i++) {
            		if (array1[i] != array2[i]) {
                		return false;
            		}
        	}
        	return true;
    	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String string = sc.next();

		// Call getCharacters() method to get user-defined characters
        	char[] array1 = getCharacters(string);

        	// Get characters using built-in toCharArray() method
        	char[] array2 = string.toCharArray();

		System.out.println("Result using getCharacters() method: " + Arrays.toString(array1));
		System.out.println("Result using built-in toCharArray() method: " + Arrays.toString(array2));

		if (compareCharArrays(array1, array2)) {
			System.out.println("The two arrays are same");
		}
		else {
			System.out.println("The two arrays are not same");
		}
	}
}

/*
Input:
	String: "hello"
Output:
	Result using getCharacters() method: [h, e, l, l, o]
	Result using built-in toCharArray() method: [h, e, l, l, o]
	The two arrays are same
*/
