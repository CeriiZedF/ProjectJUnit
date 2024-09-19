package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MillimeterConverterTest {

    @Test
    public void testMillimeterToMeterConversion() {
        MillimeterConverter converter = new MillimeterConverter();
        assertEquals(0.001, converter.convert(1.0), 0.0001);
        assertEquals(1.0, converter.convert(1000.0), 0.0001);
    }

    @Test
    public void testZeroMillimeter() {
        MillimeterConverter converter = new MillimeterConverter();
        assertEquals(0.0, converter.convert(0), 0.0001);
    }

    @Test
    public void testNegativeMillimeter() {
        MillimeterConverter converter = new MillimeterConverter();
        assertEquals(-0.001, converter.convert(-1.0), 0.0001);
    }
}
