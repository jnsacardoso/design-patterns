import org.junit.jupiter.api.Test;
import pack.StringCaseChanger;
import pack.StringDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCaseChangerTest {
    @Test
    public void stringCaseChanger() {
        StringDrink drink = new StringDrink("aBcD");
        StringCaseChanger cc = new StringCaseChanger();
        cc.execute(drink);
        assertEquals("AbCd", drink.getText());
    }
}
