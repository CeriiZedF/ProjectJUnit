package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testCalculateArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20.0, rectangle.calculateArea(), 0.001);
    }
}
