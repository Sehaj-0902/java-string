// Program to find vowels and consonants in a string and display the count of Vowels and Consonants in the string

import java.util.Scanner;

public class VowelConsonant {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String inputString = sc.nextLine();

        	// Call findVowelConsonantCount() to get the count of vowels and consonants
        	int[] counts = findVowelConsonantCount(inputString);

        	System.out.println("Vowel count: " + counts[0]);
        	System.out.println("Consonant count: " + counts[1]);
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

    	// findVowelConsonantCount() method to find vowels and consonants in a string using charAt() method and return the count of vowels and consonants in an array
    	public static int[] findVowelConsonantCount(String str) {
        	int vowelCount = 0;
        	int consonantCount = 0;

        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);
            		String result = checkVowelConsonant(ch);

            		if (result.equals("Vowel")) {
                		vowelCount++;
            		}
			else if (result.equals("Consonant")) {
                		consonantCount++;
            		}
        	}
        	return new int[] { vowelCount, consonantCount };
    	}
}

/*
Input:
	String: "hello"
Output:
	Vowel count: 2
	Consonant count: 3
*/
