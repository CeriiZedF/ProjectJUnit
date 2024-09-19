package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @Test
    public void testCalculateArea() {
        Square square = new Square(5);
        assertEquals(25.0, square.calculateArea(), 0.001);
    }
}
