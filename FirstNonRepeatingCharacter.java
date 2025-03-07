// Program to find the first non-repeating character in a string and show the result

import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	Character nonRepeatingCharacter = findFirstNonRepeatingCharacter(string);

        	if (nonRepeatingCharacter != null) {
            		System.out.println("The first non-repeating character is: " + nonRepeatingCharacter);
        	}
		else {
            		System.out.println("No non-repeating character found");
        	}
    	}

	// findFirstNonRepeatingCharacter() method to find the first non-repeating character in a string
    	public static Character findFirstNonRepeatingCharacter(String string) {
        	int[] charFrequency = new int[256];

        	// Calculate character frequencies
        	for (int i = 0; i < string.length(); i++) {
            		charFrequency[string.charAt(i)]++;
        	}

        	// Find the first non-repeating character
        	for (int i = 0; i < string.length(); i++) {
            		if (charFrequency[string.charAt(i)] == 1) {
                		return string.charAt(i);
            		}
        	}

		return null;
    	}
}

/*
Input:
	String: "aaabcddd"
Output:
	The first non-repeating character is: b
*/

