package convertermoney;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {

    @Test
    public void testUsdToEurConversion() {
        CurrencyConverter converter = new CurrencyConverterImpl();
        double result = converter.convert("USD", "EUR", 100.0);
        assertEquals(85.0, result, 0.001);
    }

    @Test
    public void testEurToUsdConversion() {
        CurrencyConverter converter = new CurrencyConverterImpl();
        double result = converter.convert("EUR", "USD", 85.0);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    public void testGbpToJpyConversion() {
        CurrencyConverter converter = new CurrencyConverterImpl();
        double result = converter.convert("GBP", "JPY", 100.0);
        assertEquals(14666.666, result, 0.001);
    }

    @Test
    public void testInvalidCurrency() {
        CurrencyConverter converter = new CurrencyConverterImpl();
        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert("XYZ", "USD", 100.0);
        });
    }
}
