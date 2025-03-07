// Program to count the number of vowels and consonants in a given string

import java.util.Scanner;

public class CountVowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.nextLine();

		// Call findVowelConsonantCount() to get the count of vowels and consonants
        	int[] counts = findVowelConsonantCount(string);

        	System.out.println("Vowel count: " + counts[0]);
        	System.out.println("Consonant count: " + counts[1]);
	}

	// checkVowelConsonant() method to check if the character is a vowel or consonant
    	public static String checkVowelConsonant(char ch) {
        	if (ch >= 'A' && ch <= 'Z') {
            		ch = (char) (ch + 32);
        	}

        	// Check if the character is a vowel or consonant
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

	// findVowelConsonantCount() method to find vowels and consonants in a string
	public static int[] findVowelConsonantCount(String string) {
		int vowelCount = 0;
        	int consonantCount = 0;

        	for (int i = 0; i < string.length(); i++) {
            		char ch = string.charAt(i);
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
	String: "hello world"
Output:
	Vowel count: 3
	Consonant count: 7
*/
