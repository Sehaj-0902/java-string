// Program to replace a given word with another word in a sentence

import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a sentence: ");
        	String sentence = sc.nextLine();

        	System.out.print("Enter the word to replace: ");
        	String wordToReplace = sc.nextLine();

        	System.out.print("Enter the replacement word: ");
        	String replacementWord = sc.nextLine();

        	String replacedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        	System.out.println("Replaced sentence: " + replacedSentence);
    	}

	// replaceWord() method to replace a word in a string
    	public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        	String[] words = sentence.split(" ");
        	StringBuilder result = new StringBuilder();

        	for (int i = 0; i < words.length; i++) {
            		if (words[i].equals(wordToReplace)) {
                		result.append(replacementWord);
            		}
			else {
                		result.append(words[i]);
            		}

            		if (i < words.length - 1) {
                		result.append(" ");
            		}
        	}
        	return result.toString();
    	}
}

/*
Input:
	Enter a sentence: "It is a good day"
	Enter the word to replace: good
	Enter the replacement word: beautiful
Output:
	Replaced sentence: it is a beautiful day
*/
