package StringProcess;

public class PalindromeChecker implements StringOperation {

    @Override
    public int execute(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed) ? 1 : 0;
    }
}
