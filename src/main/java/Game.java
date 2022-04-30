import java.util.Scanner;

public class Game {
    final static Scanner scanner = new Scanner(System.in);
    private Card[] cards;

    public Game(Card[] cards) {
        this.cards = cards;
    }

    public void startConsole() {
        for (Card card : cards) {
            System.out.println("Print the definition of " + "\"" + card.getQuestion() + "\":");
            String answer = scanner.nextLine();

            String errorMessage = "Wrong. The right answer is " + "\"" + card.getSolution() + "\". ";
            String message = card.getSolution().equals(answer) ? "Correct!" : errorMessage;
            System.out.println(message);
        }
    }

}
