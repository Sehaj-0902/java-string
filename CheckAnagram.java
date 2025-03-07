// Program to check if two texts are anagrams and display the result

import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter string1: ");
		String string1 = sc.next();

		System.out.print("Enter string2: ");
                String string2 = sc.next();

		if (areAnagrams(string1, string2)) {
            		System.out.println("The two strings are anagrams");
        	}
		else {
            		System.out.println("The two strings are not anagrams");
        	}
	}

	// areAnagrams() method to check if two strings are anagrams
	public static boolean areAnagrams(String string1, String string2) {
        	string1 = string1.replaceAll("\\s", "").toLowerCase();
        	string2 = string2.replaceAll("\\s", "").toLowerCase();

        	// Check if lengths are equal
        	if (string1.length() != string2.length()) {
            		return false;
        	}

        	int[] charCount1 = new int[256];
        	int[] charCount2 = new int[256];

	        // Calculate character frequencies for text1
        	for (char ch : string1.toCharArray()) {
            		charCount1[ch]++;
        	}

        	// Calculate character frequencies for text2
        	for (char ch : string2.toCharArray()) {
            		charCount2[ch]++;
        	}

        	// Compare the frequencies
        	for (int i = 0; i < 256; i++) {
            		if (charCount1[i] != charCount2[i]) {
                		return false;
            		}
        	}
        	return true;
    	}
}

/*
Input:
	String1: "hello"
	String2: "HeLLo"
Output:
	The two strings are anagrams

Input:
	String1: "hello"
	String2: "world"
Output:
	The two strings are not anagrams
*/
