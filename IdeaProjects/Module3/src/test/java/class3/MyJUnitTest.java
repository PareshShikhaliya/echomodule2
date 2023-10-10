package class3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyJUnitTest
{

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = 5 - 3;
        assertTrue(result > 0);
    }
}

