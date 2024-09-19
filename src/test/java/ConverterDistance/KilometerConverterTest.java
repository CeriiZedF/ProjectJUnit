package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KilometerConverterTest {

    @Test
    public void testKilometerToMeterConversion() {
        KilometerConverter converter = new KilometerConverter();
        assertEquals(1000.0, converter.convert(1.0), 0.0001);
        assertEquals(5000.0, converter.convert(5.0), 0.0001);
    }

    @Test
    public void testZeroKilometer() {
        KilometerConverter converter = new KilometerConverter();
        assertEquals(0.0, converter.convert(0), 0.0001);
    }

    @Test
    public void testNegativeKilometer() {
        KilometerConverter converter = new KilometerConverter();
        assertEquals(-1000.0, converter.convert(-1.0), 0.0001);
    }
}
