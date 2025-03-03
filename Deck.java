// Deck.java - Manages the deck of 52 cards

import java.util.*;

public class Deck {
    private ArrayList<Card> deck;  // List to store all 52 cards
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Constructor to initialize the deck
    public Deck() {
        createDeck();
    }

    // Method to create a deck of 52 playing cards
    public void createDeck() {
        deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(new Card(suit, rank)); // Create a new Card and add it to the deck
            }
        }
    }

    // Method to print all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }

    // Method to print a specific card from the deck based on index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            deck.get(index).printCard();
        } else {
            System.out.println("Invalid index. Please enter a number between 0 and 51.");
        }
    }

    // Method to search for a specific card based on suit and rank
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: ");
                card.printCard();
                return;
            }
        }
        System.out.println("Card not found.");
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully!");
    }

    // Method to deal 5 random cards
    public void dealCard() {
        if (deck.size() < 5) {
            System.out.println("Not enough cards left in the deck!");
            return;
        }
        System.out.println("Dealing 5 random cards:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(deck.size()); // Select a random card index
            deck.get(index).printCard();
        }
    }
}
