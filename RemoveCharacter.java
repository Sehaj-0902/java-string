// Program to remove all occurrences of a specific character from a string

import java.util.Scanner;

public class RemoveCharacter {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	System.out.print("Enter the character to remove: ");
        	char charToRemove = sc.next().charAt(0);

        	String result = removeCharacter(string, charToRemove);
        	System.out.println("String after removing '" + charToRemove + "': " + result);
    	}

    	public static String removeCharacter(String string, char charToRemove) {
		StringBuilder result = new StringBuilder();
        	for (int i = 0; i < string.length(); i++) {
            		if (string.charAt(i) != charToRemove) {
                		result.append(string.charAt(i));
            		}
        	}
        	return result.toString();
    	}
}

/*
Input:
	Enter a string: "world"
	Enter the character to remove: "l"
Output:
	String after removing 'l': word
*/
