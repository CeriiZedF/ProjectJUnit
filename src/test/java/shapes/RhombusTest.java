package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RhombusTest {
    @Test
    public void testCalculateArea() {
        Rhombus rhombus = new Rhombus(4, 5);
        assertEquals(10.0, rhombus.calculateArea(), 0.001);
    }
}
