Project Description -

This is a menu-driven Java program that simulates a deck of 52 playing cards. The program includes various operations like creating a deck, printing cards, shuffling, dealing random cards, and searching for specific cards.

Project Structure -


Card.java → Defines the Card class with suit & rank.

Deck.java → Manages deck operations (create, shuffle, deal, etc.).

Main.java → Implements a menu-driven system for user interaction.


Features & Methods - 

The program includes the following methods:

createDeck() → Initializes a deck of 52 cards.

printDeck() → Prints all cards in the deck.

printCard(int index) → Prints a specific card from the deck.

sameCard(Card other) → Checks if two cards are from the same suit.

compareCard(Card other) → Compares if two cards have the same rank.

findCard(String suit, String rank) → Searches for a particular card.

shuffleDeck() → Shuffles the deck randomly.

dealCard() → Deals 5 random cards.
