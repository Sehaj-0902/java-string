// Program to remove all duplicate characters from a given string and return the modified string

import java.util.Scanner;

public class RemoveDuplicateCharacters {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
        	String string = sc.next();

        	String modifiedString = removeDuplicates(string);

        	System.out.println("String before removing duplicates: " + string);
        	System.out.println("String after removing duplicates: " + modifiedString);
    	}

	// removeDuplicates() method to remove duplicates from a string
    	public static String removeDuplicates(String string) {
        	if (string == null || string.isEmpty()) {
            		return string;
        	}

        	StringBuilder result = new StringBuilder();
        	for (int i = 0; i < string.length(); i++) {
            		char ch = string.charAt(i);
            		boolean isDuplicate = false;

            		// Check if the current character has appeared earlier
            		for (int j = 0; j < i; j++) {
                		if (string.charAt(j) == ch) {
                    			isDuplicate = true;
                    			break; 
                		}
            		}

            		if (!isDuplicate) {
                		result.append(ch);
            		}
        	}
        	return result.toString();
    	}
}

/*
Input:
	String: "hello"
Output:
	String before removing duplicates: hello
	String after removing duplicates: helo
*/
