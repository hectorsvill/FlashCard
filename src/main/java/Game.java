import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    final static Scanner scanner = new Scanner(System.in);
    private List<Card> cardList = new ArrayList<>();

    public Game(List<Card> cards) {
        this.cardList = cards;
    }

    public void startConsole() {
        for (Card card : cardList) {
            System.out.println("Print the definition of " + "\"" + card.getQuestion() + "\":");
            String answer = scanner.nextLine();

            var errorMessage = "Wrong. The right answer is " + "\"" + card.getSolution() + "\". ";
            var message = card.getSolution().equals(answer) ? "Correct!" : errorMessage;
            System.out.println(message);
        }
    }

}
