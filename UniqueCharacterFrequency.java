// Program to find the frequency of characters in a string using unique characters and display the result

import java.util.Scanner;

public class UniqueCharacterFrequency {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	String[][] frequencyResult = findCharacterFrequency(string);

        	System.out.println("Character Frequencies (Unique):");
        	for (String[] ch : frequencyResult) {
            		System.out.println("'" + ch[0] + "': " + ch[1]);
        	}
	}

    	public static char[] findUniqueCharacters(String string) {
        	int length = string.length();
        	char[] uniqueChars = new char[length];
        	int uniqueCount = 0;

        	for (int i = 0; i < length; i++) {
            		char ch = string.charAt(i);
            		boolean isUnique = true;

            		for (int j = 0; j < uniqueCount; j++) {
                		if (ch == uniqueChars[j]) {
                    			isUnique = false;
                    			break;
                		}
            		}

            		if (isUnique) {
                		uniqueChars[uniqueCount] = ch;
                		uniqueCount++;
            		}
        	}

        	char[] result = new char[uniqueCount];
        	System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        	return result;
    	}

    	public static String[][] findCharacterFrequency(String string) {
	        int[] charFrequency = new int[256];

        	for (int i = 0; i < string.length(); i++) {
            		charFrequency[string.charAt(i)]++;
        	}

        	char[] uniqueChars = findUniqueCharacters(string);
        	String[][] result = new String[uniqueChars.length][2];

        	for (int i = 0; i < uniqueChars.length; i++) {
            		result[i][0] = String.valueOf(uniqueChars[i]);
            		result[i][1] = String.valueOf(charFrequency[uniqueChars[i]]);
        	}

        	return result;
    	}
}

/*
Input:
	String: "hello"
Output:
	Character Frequencies (Unique):
	'h': 1
	'e': 1
	'l': 2
	'o': 1
*/
