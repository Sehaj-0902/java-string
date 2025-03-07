// Program to find the most frequent character in a string

import java.util.Scanner;

public class MostFrequentCharacter {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	char mostFrequent = findMostFrequentCharacter(string);

        	if (mostFrequent != '\0') {
            		System.out.println("Most frequent character: " + mostFrequent);
        	}
		else {
            		System.out.println("The string is empty or null");
        	}
    	}

	// findMostFrequentCharacter() method to find most frequent character in a string
    	public static char findMostFrequentCharacter(String string) {
        	int maxFrequency = 0;
        	char mostFrequentChar = '\0';

        	for (int i = 0; i < string.length(); i++) {
            		int currentFrequency = 0;
            		for (int j = 0; j < string.length(); j++) {
                		if (string.charAt(i) == string.charAt(j)) {
                    			currentFrequency++;
                		}
            		}

            		if (currentFrequency > maxFrequency) {
                		maxFrequency = currentFrequency;
                		mostFrequentChar = string.charAt(i);
            		}
        	}
        	return mostFrequentChar;
    	}
}

/*
Input:
	String: "success"
Output:
	Most frequent character: s

Input:
	String: "programming"
Output:
	Most frequent character: r
*/
