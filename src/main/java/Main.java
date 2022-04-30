
public class Main {

    public static void main(String[] args) {
        // with console
        flashCardConsole();
    }

    private static void flashCardConsole() {
        CardCollection cardCollection = new CardCollection();
        cardCollection.withConsole();
        Game game = new Game(cardCollection.getCards());
        game.startConsole();
    }
}
