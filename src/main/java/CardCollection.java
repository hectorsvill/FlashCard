import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CardCollection {
    final static Scanner scanner = new Scanner(System.in);
    private List<Card> cardList = new ArrayList<>();

    public List<Card> getCards() {
        return cardList;
    }

    public void withConsole() {
        System.out.println("Input the number of cards:");
        String numberOfCardsStr = scanner.nextLine();
        int numberOfCards = parseInt(numberOfCardsStr);

        for (int i = 0; i < numberOfCards; i++) {
            System.out.println("Card #" + (i + 1) + ":");
            String question = scanner.nextLine();

            System.out.println("The definition for card #" + (i + 1) + ":");
            String solution = scanner.nextLine();

            Card card = new Card(question, solution);
            cardList.add(card);
        }
    }

    public void withResourceTxt(String fileName) {
        URL path = getClass().getClassLoader().getResource(fileName);
        if (path == null) {
            System.out.println("CardCollection.resourceTxt ERROR:File not found");
            return;
        }

        try {
            File triviaFile = new File(path.getFile());
            Scanner reader = new Scanner(triviaFile);

            while (reader.hasNextLine()) {
                String q = reader.nextLine();
                String a = reader.nextLine().replaceFirst("Answer: ", "");
                Card card = new Card(q, a);
                cardList.add(card);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("CardCollection.resourceTxt ERROR:File not found");
            e.printStackTrace();
        }
    }


}
