// Program to count how many times a given substring occurs in a string

import java.util.Scanner;

public class SubstringOccurrences {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a string: ");
        	String string = sc.nextLine();

        	System.out.print("Enter the substring to count: ");
        	String subString = sc.nextLine();

        	int occurrences = countSubstringOccurrences(string, subString);

        	System.out.println("The substring \"" + subString + "\" occurs " + occurrences + " times in the string");
	}

	// countSubstringOccurrences() method to count occurrence of substring in a string
    	public static int countSubstringOccurrences(String string, String subString) {
        	if (string == null || subString == null || string.isEmpty() || subString.isEmpty()) {
            		return 0;
        	}

        	int count = 0;
        	int stringLength = string.length();
        	int subStringLength = subString.length();

        	for (int i = 0; i <= stringLength - subStringLength; i++) {
            		boolean flag = true;
            		for (int j = 0; j < subStringLength; j++) {
                		if (string.charAt(i + j) != subString.charAt(j)) {
                    			flag = false;
                    			break;
                		}
            		}
            		if (flag) {
                		count++;
            		}
        	}
        	return count;
    	}
}

/*
Input:
	String: "it is a good day"
	Substring: "a"
Output:
	The substring "a" occurs 2 times in the string
*/

