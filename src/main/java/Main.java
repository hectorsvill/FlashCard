import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static Card[] cards;

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        System.out.println("Input the number of cards:");
        String numberOfCardsStr = scanner.nextLine();
        int numberOfCards = parseInt(numberOfCardsStr);
        cards = new Card[numberOfCards];

        for (int i = 0; i < numberOfCards; i++) {
            System.out.println("Card #" + (i + 1) + ":");
            String question = scanner.nextLine();

            System.out.println("The definition for card #" + (i + 1) + ":");
            String solution = scanner.nextLine();

            Card card = new Card(question, solution);
            cards[i] = card;
        }

        for (int i = 0; i < numberOfCards; i++) {
            System.out.println("Print the definition of " + "\"" + cards[i].question + "\":" );
            String answer = scanner.nextLine();

            String errorMessage = "Wrong. The right answer is " + "\"" + cards[i].solution + "\". ";
            String message =  cards[i].solution.equals(answer) ? "Correct!" : errorMessage;
            System.out.println(message);
        }
    }
}
