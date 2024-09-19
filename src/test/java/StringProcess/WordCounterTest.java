package StringProcess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest {

    @Test
    public void testWordCount() {
        WordCounter counter = new WordCounter("hello");
        assertEquals(2, counter.execute("Hello world! Hello again!"));
        assertEquals(0, counter.execute("Hi there!"));
        assertEquals(1, counter.execute("hello"));
    }

    @Test
    public void testWordCountCaseInsensitive() {
        WordCounter counter = new WordCounter("Hello");
        assertEquals(2, counter.execute("hello world! HELLO again!"));
    }
}
