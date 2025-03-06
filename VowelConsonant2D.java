// Program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter using 2D array

import java.util.Scanner;

public class VowelConsonant2D {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	// Call findCharacterType() to get the character types
        	String[][] charType = findCharacterType(string);

        	// Call displayCharacterType() to display the character types in a tabular format
        	displayCharacterType(charType);
	    }

    	// checkVowelConsonant() method to check if the character is a vowel or consonant and return the result
    	public static String checkVowelConsonant(char ch) {
        	// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
        	if (ch >= 'A' && ch <= 'Z') {
            		ch = (char) (ch + 32);
        	}

        	// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
        	if (ch >= 'a' && ch <= 'z') {
            		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                		return "Vowel";
            		}
			else {
                		return "Consonant";
            		}
        	}
		else {
            		return "Not a Letter";
        	}
    	}

    	// findCharacterType() method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
    	public static String[][] findCharacterType(String string) {
        	String[][] charType = new String[string.length()][2];
        	for (int i = 0; i < string.length(); i++) {
            		char ch = string.charAt(i);
            		charType[i][0] = String.valueOf(ch);
            		charType[i][1] = checkVowelConsonant(ch);
        	}
        	return charType;
    	}

    	// displayCharacterType() method to display the 2D Array of Strings in a Tabular Format
    	public static void displayCharacterType(String[][] charType) {
        	System.out.println("Character\tType");
        	for (String[] charData : charType) {
            		System.out.println(charData[0] + "\t\t" + charData[1]);
        	}
    	}
}

/*
Input:
	String: "hello"
Output:
	Character       Type
	h               Consonant
	e               Vowel
	l               Consonant
	l               Consonant
	o               Vowel
*/
