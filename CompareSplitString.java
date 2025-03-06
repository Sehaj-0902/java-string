// Program to split the text into words, compare the result with the split() method and display the result 

import java.util.Arrays;
import java.util.Scanner;

public class CompareSplitString {
	public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	// Split using user-defined method
        	String[] array1 = splitString(string);

        	// Split using built-in split() method
        	String[] array2 = string.split(" ");

	        System.out.println("Result using splitString() method: " + Arrays.toString(array1));
        	System.out.println("Result using built-in split() method: " + Arrays.toString(array2));

		if (compareStringArrays(array1, array2)) {
			System.out.println("The two arrays are same");
		}
		else {
			System.out.println("The two arrays are not same");
		}
	}

	// getStringLength() method to find string length
    	public static int getStringLength(String string) {
        	int count = 0;
        	if (string == null || string.isEmpty()) {
            		return 0;
        	}

        	while (true) {
            		if (count >= string.length()) {
                		break;
            		}
            		count++;
        	}
        	return count;
    	}

	// splitString() method to split the string
    	public static String[] splitString(String string) {
        	if (string == null || string.isEmpty()) {
        		return new String[0];
        	}

        	int wordCount = 1;
        	for (int i = 0; i < string.length(); i++) {
            		if (string.charAt(i) == ' ') {
                		wordCount++;
            		}
        	}

        	String[] words = new String[wordCount];
        	int wordIndex = 0;
        	int lastSpaceIndex = -1;

        	for (int i = 0; i <= string.length(); i++) {
            		if (i == string.length() || string.charAt(i) == ' ') {
                		words[wordIndex++] = string.substring(lastSpaceIndex + 1, i);
                		lastSpaceIndex = i;
            		}
        	}
        	return words;
    	}

	// compareStrings() method to compare the arrays
    	public static boolean compareStringArrays(String[] array1, String[] array2) {
        	if (array1.length != array2.length) {
            		return false;
        	}
        	for (int i = 0; i < array1.length; i++) {
            		if (!array1[i].equals(array2[i])) {
                		return false;
            		}
        	}
        	return true;
    	}
}

/*
Input:
	String: "Hello World"
Output:
	Result using splitString() method: [Hello, World]
	Result using built-in split() method: [Hello, World]
	The two arrays are same
*/
