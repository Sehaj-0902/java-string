// Program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	int[] studentAges = new int[10];
        	// Take user input for the age of 10 students
        	for (int i = 0; i < 10; i++) {
            		System.out.print("Enter age of student " + (i + 1) + ": ");
            		studentAges[i] = sc.nextInt();
        	}

        	// Call checkVotingEligibility() to get the eligibility status
        	String[][] eligibilityArray = checkVotingEligibility(studentAges);

        	// Call displayEligibility() to display the eligibility status in a tabular format
        	displayEligibility(eligibilityArray);
    	}

    	// checkVotingEligibility() method to check voting eligibility and return a 2D array of age and eligibility status
    	public static String[][] checkVotingEligibility(int[] ages) {
        	String[][] eligibilityArray = new String[ages.length][2];
        	for (int i = 0; i < ages.length; i++) {
            		eligibilityArray[i][0] = String.valueOf(ages[i]);
            		if (ages[i] >= 18) {
                		eligibilityArray[i][1] = "true";
            		}
			else if (ages[i] < 0){
                		eligibilityArray[i][1] = "false";
            		}
			else {
                		eligibilityArray[i][1] = "false";
            		}
        	}
        	return eligibilityArray;
    	}

    	// displayEligibility() method to display the 2D array in a tabular format
    	public static void displayEligibility(String[][] eligibilityArray) {
        	System.out.println("Age\tCan Vote");
        	for (String[] studentData : eligibilityArray) {
            		System.out.println(studentData[0] + "\t" + studentData[1]);
        	}
    	}
}

/*
Input:
	Enter age of student 1: 20
	Enter age of student 2: 17
	Enter age of student 3: 18
	Enter age of student 4: 19
	Enter age of student 5: 15
	Enter age of student 6: 14
	Enter age of student 7: 2
	Enter age of student 8: 23
	Enter age of student 9: 18
	Enter age of student 10: 10

Output:
	Age     Can Vote
	20      true
	17      false
	18      true
	19      true
	15      false
	14      false
	2       false
	23      true	
	18      true
	10      false
*/
