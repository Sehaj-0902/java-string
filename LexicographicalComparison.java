// Program to compare two strings lexicographically (dictionary order) without using built-in compare methods

import java.util.Scanner;

public class LexicographicalComparison {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter string1: ");
        	String string1 = sc.nextLine();

        	System.out.print("Enter string2: ");
        	String string2 = sc.nextLine();

        	System.out.println(compareLexicographically(string1, string2));
    	}

	// compareLexicographically() method to compare strings lexicographically
    	public static String compareLexicographically(String string1, String string2) {
        	int length1 = string1.length();
        	int length2 = string2.length();
        	int minLength = Math.min(length1, length2);

        	for (int i = 0; i < minLength; i++) {
            		char char1 = string1.charAt(i);
            		char char2 = string2.charAt(i);

            		if (char1 < char2) {
                		return "\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order";
            		}
			else if (char1 > char2) {
                		return "\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order";
            		}
        	}

        	if (length1 < length2) {
            		return "\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order";
        	}
		else if (length1 > length2) {
            		return "\"" + string2 + "\" comes before \"" + string1 + "\" in lexicographical order";
        	}
		else {
            		return "Strings are equal";
        	}
    	}
}

/*
Input:
	String 1: "hello"
	String 2: "world"
Output:
	"hello" comes before "world" in lexicographical order

Input:
	String1: "good"
	String2: "day"
Output:
	"day" comes before "good" in lexicographical order
*/
