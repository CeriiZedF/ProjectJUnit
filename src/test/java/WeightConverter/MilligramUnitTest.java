package WeightConverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MilligramUnitTest {

    @Test
    public void testConvertToBase() {
        WeightUnit mgUnit = new MilligramUnit();
        assertEquals(0.001, mgUnit.convertToBase(1000), 0.001);
    }

    @Test
    public void testConvertFromBase() {
        WeightUnit mgUnit = new MilligramUnit();
        assertEquals(1000, mgUnit.convertFromBase(0.001), 0.001);
    }
}
