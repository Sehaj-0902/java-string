// Program to find the frequency of characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
	        String string = sc.nextLine();

        	String[][] frequencyResult = findCharacterFrequency(string);

        	System.out.println("Character Frequencies:");
        	for (String[] ch : frequencyResult) {
            		System.out.println("'" + ch[0] + "': " + ch[1]);
        	}
    	}

	// findCharacterFrequency() method to find frequency of characters in a string
    	public static String[][] findCharacterFrequency(String string) {

        	int[] charFrequency = new int[256];

        	// Calculate character frequencies
        	for (int i = 0; i < string.length(); i++) {
            		charFrequency[string.charAt(i)]++;
        	}

        	// Count unique characters with non-zero frequencies
        	int uniqueCount = 0;
        	for (int frequency : charFrequency) {
            		if (frequency > 0) {
                		uniqueCount++;
            		}
        	}

        	String[][] result = new String[uniqueCount][2];
        	int resultIndex = 0;

        	// Store unique characters and their frequencies
        	for (int i = 0; i < charFrequency.length; i++) {
            		if (charFrequency[i] > 0) {
                		result[resultIndex][0] = String.valueOf((char) i);
                		result[resultIndex][1] = String.valueOf(charFrequency[i]);
                		resultIndex++;
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
	'e': 1
	'h': 1
	'l': 2
	'o': 1
*/
