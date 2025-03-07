// Program to find the frequency of characters in a string using nested loops and display the result

import java.util.Scanner;

public class CharacterFrequencyNestedLoop {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	String[] frequencyResult = findCharacterFrequency(string);

        	System.out.println("Character Frequencies:");
        	for (int i = 0; i < frequencyResult.length; i += 2) {
            		System.out.println("'" + frequencyResult[i] + "': " + frequencyResult[i + 1]);
        	}
    	}

	// findCharacterFrequency() method to find character frequency in a string
    	public static String[] findCharacterFrequency(String string) {
        	char[] characters = string.toCharArray();
        	int[] frequencies = new int[characters.length];

        	// Find character frequencies using nested loops
        	for (int i = 0; i < characters.length; i++) {
            		if (characters[i] != '0') {
                		frequencies[i] = 1; 
                		for (int j = i + 1; j < characters.length; j++) {
                    			if (characters[i] == characters[j]) {
                        			frequencies[i]++;
                        			characters[j] = '0';
                    			}
                		}
            		}
        	}

        	// Create a String array to store characters and frequencies
        	int resultSize = 0;
        	for (int freq : frequencies) {
            		if (freq > 0) {
                		resultSize++;
            		}
        	}
        	String[] result = new String[resultSize * 2];

        	int resultIndex = 0;
        	for (int i = 0; i < characters.length; i++) {
            		if (characters[i] != '0') {
                		result[resultIndex++] = String.valueOf(characters[i]);
                		result[resultIndex++] = String.valueOf(frequencies[i]);
            		}
        	}

        	return result;
    	}
}

/*
Input:
	String: "hello"
Output:
	Character Frequencies:
	'h': 1
	'e': 1
	'l': 2
	'o': 1
*/
