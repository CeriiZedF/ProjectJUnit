package StringProcess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VowelCounterTest {

    @Test
    public void testVowelCount() {
        VowelCounter counter = new VowelCounter();
        assertEquals(5, counter.execute("Hello World"));
        assertEquals(0, counter.execute("Gym"));
        assertEquals(10, counter.execute("This is a sentence with vowels"));
    }
}
