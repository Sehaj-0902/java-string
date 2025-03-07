// Program for Rock Paper Scissors

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the number of games to play: ");
        	int numberOfGames = sc.nextInt();

        	int userWins = 0;
        	int computerWins = 0;

        	String[][] gameResults = new String[numberOfGames][3];

        	// Play the specified number of games
        	for (int i = 0; i < numberOfGames; i++) {
            		System.out.print("Enter your choice (rock, paper, scissors): ");
            		String userChoice = sc.next().toLowerCase();
        	    	String computerChoice = getComputerChoice();
	
            		String winner = determineWinner(userChoice, computerChoice);

            		gameResults[i][0] = userChoice;
            		gameResults[i][1] = computerChoice;
            		gameResults[i][2] = winner;

            		if (winner.equals("User")) {
                		userWins++;
            		}
			else if (winner.equals("Computer")) {
                		computerWins++;
            		}
        	}

        	// Call displayResults() method to display game results and statistics
        	displayResults(gameResults, userWins, computerWins, numberOfGames);
	}

    	// getComputerChoice() method to find the Computer Choice using Math.random
    	public static String getComputerChoice() {
        	Random random = new Random();
        	int choice = random.nextInt(3);
        	if (choice == 0) {
            		return "rock";
        	}
		else if (choice == 1) {
            		return "paper";
        	}
		else {
            		return "scissors";
        	}
    	}

    	// determineWinner() method to find the winner between the user and the computer
    	public static String determineWinner(String userChoice, String computerChoice) {
    		if (userChoice.equals(computerChoice)) {
            		return "Tie";
        	}
		else if (userChoice.equals("rock") && computerChoice.equals("scissors")
            	|| userChoice.equals("paper") && computerChoice.equals("rock")
                || userChoice.equals("scissors") && computerChoice.equals("paper")) {
            		return "User";
       	 	}
		else {
            		return "Computer";
        	}
    	}

    	// calculateStats() Method to find the average and percentage of wins for the user and the computer
    	public static String[][] calculateStats(int userWins, int computerWins, int numberOfGames) {
        	String[][] stats = new String[2][2];
        	double userPercentage = (double) userWins / numberOfGames * 100;
        	double computerPercentage = (double) computerWins / numberOfGames * 100;

        	stats[0][0] = String.valueOf(userWins);
        	stats[0][1] = String.format("%.2f%%", userPercentage);
        	stats[1][0] = String.valueOf(computerWins);
        	stats[1][1] = String.format("%.2f%%", computerPercentage);

    		return stats;
    	}

    	// displayResults() method to display the results of every game and also display the average and percentage wins
    	public static void displayResults(String[][] gameResults, int userWins, int computerWins, int numberOfGames) {
        	System.out.println("\nGame Results:");
        	System.out.println("User Choice\tComputer Choice\t\tWinner");
        	System.out.println("----------------------------------------------");

        	// displayResults() method to display results for each game
        	for (String[] result : gameResults) {
            		System.out.println(result[0] + "\t\t" + result[1] + "\t\t\t" + result[2]);
        	}

        	String[][] stats = calculateStats(userWins, computerWins, numberOfGames);

        	System.out.println("\nStatistics:");
        	System.out.println("Player\t\tWins\tPercentage");
        	System.out.println("----------------------------------------");
        	System.out.println("User\t\t" + stats[0][0] + "\t" + stats[0][1]);
        	System.out.println("Computer\t" + stats[1][0] + "\t" + stats[1][1]);
    	}
}
