
public class Main {

    public static void main(String[] args) {
        // with console
//        flashCardConsole();
        flashCardConsole("GeneralTrivia.txt");
    }

    private static void flashCardConsole() {
        CardCollection cardCollection = new CardCollection();
        cardCollection.withConsole();
        Game game = new Game(cardCollection.getCards());
        game.startConsole();
    }

    private static void flashCardConsole(String pathName) {
        CardCollection cardCollection = new CardCollection();
        cardCollection.withResourceTxt(pathName);
        Game game = new Game(cardCollection.getCards());
        game.startConsole();
    }
}
