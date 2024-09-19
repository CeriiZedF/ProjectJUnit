package convertermoney;

public interface CurrencyConverter {
    double convert(String fromCurrency, String toCurrency, double amount);
}
