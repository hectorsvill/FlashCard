import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CardCollection {
    final static Scanner scanner = new Scanner(System.in);
    private Card[] cards;

    public void withConsole() {
        System.out.println("Input the number of cards:");
        String numberOfCardsStr = scanner.nextLine();
        int numberOfCards = parseInt(numberOfCardsStr);
        cards = new Card[numberOfCards];

        for (int i = 0; i < cards.length; i++) {
            System.out.println("Card #" + (i + 1) + ":");
            String question = scanner.nextLine();

            System.out.println("The definition for card #" + (i + 1) + ":");
            String solution = scanner.nextLine();

            Card card = new Card(question, solution);
            cards[i] = card;
        }
    }

    public Card[] getCards() {
        return cards;
    }

}
