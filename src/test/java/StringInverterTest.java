import org.junit.jupiter.api.Test;
import pack.StringDrink;
import pack.StringInverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringInverterTest {
    @Test
    public void stringInverter() {
        StringDrink drink = new StringDrink("ABCD");
        StringInverter si = new StringInverter();
        si.execute(drink);
        assertEquals("DCBA", drink.getText());
    }
}
