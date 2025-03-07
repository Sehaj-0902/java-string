// Program to find the BMI and display the height, weight, BMI, and status of each individual

import java.util.Scanner;

public class CalculateStatusBMI {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	double[][] personData = new double[10][2];

        	// Input height for 10 persons
        	for (int i = 0; i < 10; i++) {
            		System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            		personData[i][0] = sc.nextDouble();
		}

		// Input weight for 10 persons
                for (int i = 0; i < 10; i++) {
			System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
	        	personData[i][1] = sc.nextDouble();
        	}

        	String[][] bmiResults = calculateBMIAndStatus(personData);
        	displayResults(bmiResults);
    	}

    	// calculateBMIAndStatus() method to calculate BMI and status
    	public static String[][] calculateBMIAndStatus(double[][] personData) {
        	String[][] results = new String[10][4]; // 10 persons, height, weight, BMI, status

        	// Calculate BMI and determine status for each person
        	for (int i = 0; i < 10; i++) {
            		double weight = personData[i][0];
            		double heightCm = personData[i][1];
			// Convert cm to meters
            		double heightM = heightCm / 100.0; 

            		double bmi = weight / (heightM * heightM);
            		String status;

            		// Determine BMI status
            		if (bmi < 18.5) {
                		status = "Underweight";
            		}
			else if (bmi < 25) {
                		status = "Normal weight";
            		}
			else if (bmi < 30) {
                		status = "Overweight";
            		}
			else {
                		status = "Obese";
            		}

            		// Store results in the string array
            		results[i][0] = String.format("%.2f", heightCm);
            		results[i][1] = String.format("%.2f", weight);
            		results[i][2] = String.format("%.2f", bmi);
            		results[i][3] = status;
        	}
        	return results;
    	}

    	// processData() method to process data and call BMI calculation
    	public static String[][] processData(double[][] personData) {
        	return calculateBMIAndStatus(personData);
    	}

    	// displayResults() method to display results
    	public static void displayResults(String[][] results) {
        	System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        	for (String[] row : results) {
            		System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        	}
    	}
}
