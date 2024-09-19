package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CentimeterConverterTest {

    @Test
    public void testCentimeterToMeterConversion() {
        CentimeterConverter converter = new CentimeterConverter();
        assertEquals(0.01, converter.convert(1.0), 0.0001);
        assertEquals(1.0, converter.convert(100.0), 0.0001);
    }

    @Test
    public void testZeroCentimeter() {
        CentimeterConverter converter = new CentimeterConverter();
        assertEquals(0.0, converter.convert(0), 0.0001);
    }

    @Test
    public void testNegativeCentimeter() {
        CentimeterConverter converter = new CentimeterConverter();
        assertEquals(-0.01, converter.convert(-1.0), 0.0001);
    }
}
