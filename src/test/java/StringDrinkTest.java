import org.junit.jupiter.api.Test;
import pack.StringDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringDrinkTest {
    @Test
    public void stringDrink() {
        StringDrink drink = new StringDrink("ABCD");
        assertEquals("ABCD", drink.getText());
        drink.setText("DCBA");
        assertEquals("DCBA", drink.getText());
    }
}
