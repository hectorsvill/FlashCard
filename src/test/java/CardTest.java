import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testCardInput() {
        String question = "test";
        String solution = "a test";
        Card c1 = new Card(question,solution);
        assertEquals(c1.getQuestion(),question);
        assertEquals(c1.getSolution(),solution);
    }



}