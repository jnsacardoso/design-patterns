import org.junit.jupiter.api.Test;
import pack.Bar;
import pack.StringBar;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyHourTest {
    @Test
    public void happyHour() {
        Bar bar = new StringBar();
        assertFalse(bar.isHappyHour());
        bar.startHappyHour();
        assertTrue(bar.isHappyHour());
        bar.endHappyHour();
        assertFalse(bar.isHappyHour());
    }
}
