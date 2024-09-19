package StringProcess;

public class WordCounter implements StringOperation {
    private final String word;

    public WordCounter(String word) {
        this.word = word.toLowerCase();
    }

    @Override
    public int execute(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
