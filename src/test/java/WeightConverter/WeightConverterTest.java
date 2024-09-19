package WeightConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WeightConverterTest {

    private WeightConverter converter = new WeightConverter();

    @Test
    public void testMilligramToGram() {
        double result = converter.convert(1000, "mg", "g");
        assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testGramToKilogram() {
        double result = converter.convert(1000, "g", "kg");
        assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testKilogramToTonne() {
        double result = converter.convert(1000, "kg", "tonne");
        assertEquals(1.0, result, 0.001);
    }

    @Test
    public void testCentnerToKilogram() {
        double result = converter.convert(1, "centner", "kg");
        assertEquals(100.0, result, 0.001);
    }

    @Test
    public void testTonneToMilligram() {
        double result = converter.convert(1, "tonne", "mg");
        assertEquals(1_000_000_000, result, 0.001);
    }

    @Test
    public void testUnknownUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(1, "unknown", "kg");
        });
    }
}
