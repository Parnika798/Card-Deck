// Card.java - Represents a single card in the deck

public class Card {
    private String suit;  // Stores the suit of the card (Hearts, Diamonds, Clubs, Spades)
    private String rank;  // Stores the rank of the card (2,3,4...Jack, Queen, King, Ace)

    // Constructor to initialize a card with suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method to retrieve suit of the card
    public String getSuit() {
        return suit;
    }
    

    // Getter method to retrieve rank of the card
    public String getRank() {
        return rank;
    }
    
    

    // Method to print a single card's details
    public void printCard() {
        System.out.println(rank + " of " + suit);
    }

    // Method to check if two cards belong to the same suit
    public boolean sameCard(Card other) {
        return this.suit.equals(other.suit);
    }

    // Method to compare if two cards have the same rank
    public boolean compareCard(Card other) {
        return this.rank.equals(other.rank);
    }
}
