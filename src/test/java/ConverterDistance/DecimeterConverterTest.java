package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecimeterConverterTest {

    @Test
    public void testDecimeterToMeterConversion() {
        DecimeterConverter converter = new DecimeterConverter();
        assertEquals(0.1, converter.convert(1.0), 0.0001);
        assertEquals(1.0, converter.convert(10.0), 0.0001);
    }

    @Test
    public void testZeroDecimeter() {
        DecimeterConverter converter = new DecimeterConverter();
        assertEquals(0.0, converter.convert(0), 0.0001);
    }

    @Test
    public void testNegativeDecimeter() {
        DecimeterConverter converter = new DecimeterConverter();
        assertEquals(-0.1, converter.convert(-1.0), 0.0001);
    }
}
