package StringProcess;

public class ConsonantCounter implements StringOperation {
    private final String vowels = "aeiouAEIOU";

    @Override
    public int execute(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                count++;
            }
        }
        return count;
    }
}
