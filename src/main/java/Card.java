import java.util.UUID;

public class Card {
    private String question;
    private String solution;
    private UUID id;

    public Card(String question, String solution){
        this.question = question;
        this.solution = solution;
        this.id = UUID.randomUUID();
    }

    public String getQuestion() {
        return question;
    }

    public String getSolution() {
        return solution;
    }

    public UUID getID() {
        return id;
    }
}
