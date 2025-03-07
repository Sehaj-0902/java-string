// Program to toggle the case of each character in a given string

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = sc.next();

		String toggledString = toggleCase(string);
        	System.out.println("Toggled string: " + toggledString);
	}

	public static String toggleCase(String string) {
	        StringBuilder result = new StringBuilder();
        	for (char ch : string.toCharArray()) {
            		if (Character.isUpperCase(ch)) {
                		result.append(Character.toLowerCase(ch));
            		}
			else if (Character.isLowerCase(ch)) {
                		result.append(Character.toUpperCase(ch));
            		}
			else {
                		result.append(ch); 
            		}
        	}
        	return result.toString();
    	}
}

/*
Input:
	String: "hElLo"
Output:
	Toggled string: HeLlO
*/
