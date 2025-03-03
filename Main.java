//Parnika Jain - 087 - B1
// Main.java - Menu-driven program for deck operations

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();  // Create a new deck of cards
        int choice;
        

        do {
            // Display menu options
            System.out.println("\n==== Deck of Cards Menu ====");
            System.out.println("1. Print Full Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Find a Card");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Deal 5 Random Cards");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read user input

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    scanner.nextLine();  // Consume newline left-over from nextInt()
                    System.out.print("Enter suit (Hearts, Diamonds, Clubs, Spades): ");
                    String suit = scanner.nextLine();
                    System.out.print("Enter rank (2-10, Jack, Queen, King, Ace): ");
                    String rank = scanner.nextLine();
                    deck.findCard(suit, rank);
                    break;
                case 4:
                    deck.shuffleDeck();
                    break;
                case 5:
                    deck.dealCard();
                    break;
                case 6:
                    System.out.println("Exiting program. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6); // Repeat menu until user chooses to exit

        scanner.close(); // Close scanner
    }
}
