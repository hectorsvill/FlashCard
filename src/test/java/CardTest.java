import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    private Card[] cards;
    @BeforeEach
    void setUp() {}

    @Test
    void testCardInput() {
        String question = "test";
        String solution = "a test";
        Card c1 = new Card("test","a test");
        assertTrue(c1.getQuestion().equals("test"));
        assertTrue(c1.getSolution().equals("a test"));
    }


}