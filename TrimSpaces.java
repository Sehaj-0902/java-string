// Program to trim the leading and trailing spaces from a string using the charAt() method

import java.util.Scanner;

public class TrimSpaces {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string with leading and trailing spaces: ");
        	String inputString = sc.nextLine();

        	// Call trimSpaces() to get the start and end indices after trimming
        	int[] trimIndices = trimSpaces(inputString);

        	// Call createSubstring() to create the trimmed string
        	String trimmedString1 = createSubstring(inputString, trimIndices[0], trimIndices[1]);

        	// Trim the string using the built-in trim() method
        	String trimmedString2 = inputString.trim();

        	System.out.println("Trimmed string using charAt(): \"" + trimmedString1 + "\"");
        	System.out.println("Trimmed string using built-in trim(): \"" + trimmedString2 + "\"");

        	if (compareStrings(trimmedString1, trimmedString2)) {
			System.out.println("The two strings are same");
		}
		else {
			System.out.println("The two strings are not same");
		}
	}

    	// Method to trim leading and trailing spaces using charAt() and return start and end indices
   	public static int[] trimSpaces(String str) {
        	int start = 0;
        	int end = str.length();

       		// Trim leading spaces
       		while (start < end && str.charAt(start) == ' ') {
            		start++;
        	}

       		// Trim trailing spaces
        	while (end > start && str.charAt(end - 1) == ' ') {
          		end--;
        	}
        	return new int[] { start, end };
    	}

    	// Method to create a substring from a string using charAt() with start and end indices
   	public static String createSubstring(String str, int start, int end) {
       		StringBuilder sb = new StringBuilder();
        	for (int i = start; i < end; i++) {
            		sb.append(str.charAt(i));
        	}
        	return sb.toString();
    	}

    	// Method to compare two strings using charAt() and return a boolean result
    	public static boolean compareStrings(String str1, String str2) {
        	if (str1.length() != str2.length()) {
            		return false;
        	}

        	for (int i = 0; i < str1.length(); i++) {
            		if (str1.charAt(i) != str2.charAt(i)) {
                		return false;
            		}
        	}
        	return true;
    	}
}

/*
Input:
	String: "    hello   "
Output:
	Trimmed string using charAt(): "hello"
	Trimmed string using built-in trim(): "hello"
	The two strings are same
*/
