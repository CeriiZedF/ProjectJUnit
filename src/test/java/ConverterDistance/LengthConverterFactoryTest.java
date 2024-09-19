package ConverterDistance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LengthConverterFactoryTest {

    @Test
    public void testGetMillimeterConverter() {
        LengthConverter converter = LengthConverterFactory.getConverter("mm");
        assertTrue(converter instanceof MillimeterConverter);
    }

    @Test
    public void testGetCentimeterConverter() {
        LengthConverter converter = LengthConverterFactory.getConverter("cm");
        assertTrue(converter instanceof CentimeterConverter);
    }

    @Test
    public void testGetInvalidConverter() {
        assertThrows(IllegalArgumentException.class, () -> {
            LengthConverterFactory.getConverter("invalid");
        });
    }
}
