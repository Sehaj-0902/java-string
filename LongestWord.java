// Program to find the longest word in the sentence

import java.util.Scanner;

public class LongestWord {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

		String longestWord = findLongestWord(sentence);

		if (sentence == null || sentence.isEmpty()) {
                        System.out.println("Please enter a sentence");
                }
		else {
        		System.out.println("Longest word: " + longestWord);
		}
    	}

	// findLongestWord() method to find longest word in a sentence
    	public static String findLongestWord(String sentence) {
        	String[] words = sentence.split("\\s+");
        	String longestWord = "";

        	for (String word : words) {
            		String string = word.replaceAll("[^a-zA-Z]", "");

            		if (string.length() > longestWord.length()) {
                		longestWord = string;
            		}
        	}
        	return longestWord;
    	}
}

/*
Input:
	Sentence: "It is a good day"
Output:
	Longest word: good
*/
