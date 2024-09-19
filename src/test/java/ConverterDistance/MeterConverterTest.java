package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeterConverterTest {

    @Test
    public void testMeterToMeterConversion() {
        MeterConverter converter = new MeterConverter();
        assertEquals(1.0, converter.convert(1.0), 0.0001);
        assertEquals(0.0, converter.convert(0.0), 0.0001);
    }

    @Test
    public void testNegativeMeter() {
        MeterConverter converter = new MeterConverter();
        assertEquals(-1.0, converter.convert(-1.0), 0.0001);
    }
}
