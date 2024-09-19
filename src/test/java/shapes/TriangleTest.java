package shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.calculateArea(), 0.001);
    }

    @Test
    public void testInvalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 2, 10);
        });
    }
}
