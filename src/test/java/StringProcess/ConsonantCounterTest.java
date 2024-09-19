package StringProcess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConsonantCounterTest {

    @Test
    public void testConsonantCount() {
        ConsonantCounter counter = new ConsonantCounter();
        assertEquals(7, counter.execute("Hello World"));
        assertEquals(3, counter.execute("Gym"));
        assertEquals(15, counter.execute("This is a sentence with vowels"));
    }
}
