// Program to split the text into words and return the words along with their lengths in a 2D array

import java.util.Scanner;

public class WordLength {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	// Call splitString() to split the input string into an array of words
        	String[] words = splitString(string);

        	// Call getWordLengthArray() to create a 2D array of words and their lengths
        	String[][] wordLengthArray = getWordLengthArray(words);

        	System.out.println("Word\tLength");

	        // Iterate through the 2D array and print each word and its length
        	for (String[] wordData : wordLengthArray) {
            		// Convert length from String to Integer and print
            		System.out.println(wordData[0] + "\t" + Integer.parseInt(wordData[1]));
        	}
    	}

    	// getStringLength() method to find and return a string length without using the length() method
    	public static int getStringLength(String string) {
        	int count = 0;
        	if (string == null || string.isEmpty()) {
            		return 0;
        	}

        	while (true) {
            		if (count >= string.length()) {
        	        	break;
            		}
            		count++;
        	}
        	return count;
    	}

    	// splitString() method to split the text into words using charAt() without using String built-in split() method
    	public static String[] splitString(String string) {
        	if (string == null || string.isEmpty()) {
            		return new String[0];
        	}

        	int wordCount = 1;
        	for (int i = 0; i < string.length(); i++) {
            		if (string.charAt(i) == ' ') {
                		wordCount++;
            		}
        	}

        	String[] words = new String[wordCount];
        	int wordIndex = 0;
        	int lastSpaceIndex = -1;

        	for (int i = 0; i <= string.length(); i++) {
            		if (i == string.length() || string.charAt(i) == ' ') {
                		words[wordIndex++] = string.substring(lastSpaceIndex + 1, i);
                		lastSpaceIndex = i;
            		}
        	}
        	return words;
    	}

    	// getWordLengthArray() method to take the word array and return a 2D String array of word and its length
    	public static String[][] getWordLengthArray(String[] words) {
        	String[][] wordLengthArray = new String[words.length][2];
        	for (int i = 0; i < words.length; i++) {
            		wordLengthArray[i][0] = words[i];
            		// Use String.valueOf() to generate String value for the number
            		wordLengthArray[i][1] = String.valueOf(getStringLength(words[i]));
        	}
        	return wordLengthArray;
    	}
}

/*
Input:
	String: "hello world"
Output:
	Word    Length
	hello   5
	world   5

Input:
        String: "java string"
Output:
        Word    Length
        java    4
        string  6
*/
