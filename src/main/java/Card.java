public class Card {
    private String question;
    private String solution;

    public Card(String question, String solution){
        this.question = question;
        this.solution = solution;
    }

    public String getQuestion() {
        return question;
    }

    public String getSolution() {
        return solution;
    }
}
