// Program to find unique characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
	        String string = sc.nextLine();

        	char[] uniqueCharacters = findUniqueCharacters(string);

        	System.out.print("Unique characters: ");
        	for (char ch : uniqueCharacters) {
            		System.out.print(ch + " ");
        	}
    	}

	// stringLength() method to find length of the string without using built-in method
    	public static int stringLength(String string) {
        	if (string == null) {
            		return 0;
        	}
        	char[] charArray = string.toCharArray();
        	int length = 0;
        	for (char ch : charArray) {
            		length++;
        	}
        	return length;
    	}

	// findUniqueCharacters() method to find unique characters in a string
    	public static char[] findUniqueCharacters(String string) {
        	int length = stringLength(string);
        	char[] uniqueChars = new char[length];
        	int uniqueCount = 0;

        	for (int i = 0; i < length; i++) {
            		char ch = string.charAt(i);
            		boolean isUnique = true;

            		for (int j = 0; j < uniqueCount; j++) {
                		if (ch == uniqueChars[j]) {
                    			isUnique = false;
                    			break;
                		}
            		}

            		if (isUnique) {
                		uniqueChars[uniqueCount] = ch;
                		uniqueCount++;
            		}
        	}

        	char[] result = new char[uniqueCount];
        	System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        	return result;
    	}
}

/*
Input:
	String: "hello"
Output:
	Unique characters: h e l o
*/

