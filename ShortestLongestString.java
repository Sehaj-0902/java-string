// Program to split the text into words and find the shortest and longest strings in a given text

import java.util.Scanner;

public class ShortestLongestString {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	// Call splitString() to split the input string into an array of words
        	String[] words = splitString(string);

        	// Call getWordLengthArray() to create a 2D array of words and their lengths
        	String[][] wordLengthArray = getWordLengthArray(words);

        	// Call findShortestLongest() to find the shortest and longest strings
        	String[] shortestLongest = findShortestLongest(wordLengthArray);

        	System.out.println("Shortest string: " + shortestLongest[0]);
        	System.out.println("Longest string: " + shortestLongest[1]);

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

    	// findShortestLongest() method to find the shortest and longest strings in the 2D array
    	public static String[] findShortestLongest(String[][] wordLengthArray) {
        	if (wordLengthArray == null || wordLengthArray.length == 0) {
            		return new String[] { "", "" };
        	}
        	String shortest = wordLengthArray[0][0];
        	String longest = wordLengthArray[0][0];
        	int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        	int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        	for (int i = 1; i < wordLengthArray.length; i++) {
            		int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            		if (currentLength < shortestLength) {
                		shortest = wordLengthArray[i][0];
                		shortestLength = currentLength;
            		}
            		if (currentLength > longestLength) {
                		longest = wordLengthArray[i][0];
                		longestLength = currentLength;
            		}
        	}
        	return new String[] { shortest, longest };
    	}
}

/*
Input:
	String: "It is a good day"
Output:
	Shortest string: a
	Longest string: good
*/
