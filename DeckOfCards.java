// Program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players, and print the cards the players have

import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	String[] deck = initializeDeck();
        	deck = shuffleDeck(deck);

        	System.out.print("Enter number of players: ");
        	int numberOfPlayers = sc.nextInt();

        	System.out.print("Enter number of cards per player: ");
        	int cardsPerPlayer = sc.nextInt();

        	String[][] players = distributeCards(deck, numberOfPlayers, cardsPerPlayer);
        	printPlayersCards(players);
    	}

	// initializeDeck() method to initialize the deck
  	public static String[] initializeDeck() {
        	String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        	int numberOfCards = suits.length * ranks.length;
        	String[] deck = new String[numberOfCards];

        	int index = 0;
        	for (String suit : suits) {
            		for (String rank : ranks) {
                		deck[index++] = rank + " of " + suit;
            		}
        	}
        	return deck;
    	}

	// shuffleDeck() method to shuffle the deck
 	public static String[] shuffleDeck(String[] deck) {
        	Random random = new Random();
        	int n = deck.length;
        	for (int i = 0; i < n; i++) {
            		int randomCardNumber = i + random.nextInt(n - i);
            		String temp = deck[i];
            		deck[i] = deck[randomCardNumber];
            		deck[randomCardNumber] = temp;
        	}
        	return deck;
    	}

	// distributeCards() method to distribute cards
    	public static String[][] distributeCards(String[] deck, int numberOfPlayers, int cardsPerPlayer) {
        	int totalCards = deck.length;
        	if (numberOfPlayers * cardsPerPlayer > totalCards) {
            		System.out.println("Not enough cards to distribute.");
            		return null;
        	}

        	String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        	int deckIndex = 0;

        	for (int player = 0; player < numberOfPlayers; player++) {
            		for (int card = 0; card < cardsPerPlayer; card++) {
                		players[player][card] = deck[deckIndex++];
            		}
        	}
        	return players;
    	}

	// printPlayersCards() to print the cards players have
	public static void printPlayersCards(String[][] players) {
        	if (players == null) {
            		return;
        	}

        	for (int player = 0; player < players.length; player++) {
            		System.out.println("Player " + (player + 1) + " cards:");
            		for (int card = 0; card < players[player].length; card++) {
                		System.out.println(players[player][card]);
            		}
            		System.out.println();
        	}
    	}
}

/*
Input:
	Enter number of players: 2
	Enter number of cards per player: 5
Output:
	Player 1 cards:
	King of Hearts
	4 of Clubs
	2 of Spades
	6 of Hearts
	Jack of Spades

	Player 2 cards:
	9 of Hearts
	King of Diamonds
	2 of Diamonds
	8 of Hearts
	4 of Hearts
*/
