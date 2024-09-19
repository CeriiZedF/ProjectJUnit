package convertermoney;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverterImpl implements CurrencyConverter {
    private Map<String, Double> exchangeRates = new HashMap<>();

    public CurrencyConverterImpl() {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("JPY", 110.0);
    }

    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Unknown toas currency: " + fromCurrency + " or " + toCurrency);
        }

        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);

        return (amount / fromRate) * toRate;
    }
}
