package StringProcess;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertEquals(1, checker.execute("A man a plan a canal Panama"));
        assertEquals(1, checker.execute("Madam"));
        assertEquals(0, checker.execute("Hello"));
    }
}
