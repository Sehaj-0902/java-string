// Program to take input marks of students in 3 subjects physics, chemistry, and maths and compute the total, average, the percentage score, and the grade

import java.util.Scanner;

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        	int number = sc.nextInt();

        	int[][] scores = generateScores(number);
        	double[][] results = calculateResults(scores);
        	char[] grades = calculateGrades(results);

		// Call displayScorecard() method to print results
        	displayScorecard(scores, results, grades);
	}

	// generateScores() method to generate random scores
	public static int[][] generateScores(int number) {
        	int[][] scores = new int[number][3];
        	for (int i = 0; i < number; i++) {
            		scores[i][0] = (int) (Math.random() * 50) + 50;
            		scores[i][1] = (int) (Math.random() * 50) + 50;
        	    	scores[i][2] = (int) (Math.random() * 50) + 50;
        	}
        	return scores;
    	}

	// calculateResults() method to calculate results
    	public static double[][] calculateResults(int[][] scores) {
        	double[][] results = new double[scores.length][3];
        	for (int i = 0; i < scores.length; i++) {
            		int total = scores[i][0] + scores[i][1] + scores[i][2];
            		double avg = total / 3.0;
            		double percent = (total / 300.0) * 100;
            		results[i][0] = total;
            		results[i][1] = Math.round(avg * 100.0) / 100.0;
            		results[i][2] = Math.round(percent * 100.0) / 100.0;
        	}
        	return results;
   	}

	// calculateGrades() method to calculate grades based on results
    	public static char[] calculateGrades(double[][] results) {
        	char[] grades = new char[results.length];
        	for (int i = 0; i < results.length; i++) {
           		double percent = results[i][2];
            		if (percent >= 90) {
                		grades[i] = 'A';
            		}
			else if (percent >= 80) {
                		grades[i] = 'B';
            		}
			else if (percent >= 70) {
                		grades[i] = 'C';
            		}
			else if (percent >= 60) {
                		grades[i] = 'D';
            		}
			else if (percent >= 50) {
                		grades[i] = 'E';
            		}
			else {
                		grades[i] = 'F';
           		}
        	}
        	return grades;
    	}

	// displayScorecard() method to print the results in tabular form
    	public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        	System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        	for (int i = 0; i < scores.length; i++) {
            		System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10c%n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grades[i]);
        	}
    	}
}

/*
Input:
	Enter number of students: 2
Output: 
	Student    Physics    Chemistry  Math       Total      Average    Percentage Grade
	1          87         66         99         252        84.00      84.00      B
	2          86         94         98         278        92.67      92.67      A
*/
