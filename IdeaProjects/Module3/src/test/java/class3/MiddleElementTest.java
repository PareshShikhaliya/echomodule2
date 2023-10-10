package class3;

import org.example.class3.MiddleElement2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiddleElementTest {

    @Test
    public void testFindMiddleWithOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int middle = MiddleElement2.findMiddle(arr);
        assertEquals(3, middle);
    }

    @Test
    public void testFindMiddleWithEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};
        int middle = MiddleElement2.findMiddle(arr);
        assertEquals(3, middle);
    }

    @Test
    public void testFindMiddleWithEvenLengthArray2() {
        int[] arr = {1, 2, 3, 4};
        int middle = MiddleElement2.findMiddle(arr);
        assertNotEquals(2, middle);
    }

    @Test
    public void testFindMiddleWithEmptyArray() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, () -> MiddleElement2.findMiddle(arr));
    }

    @Test
    public void testFindMiddleWithNullArray() {
        int[] arr = null;
        assertThrows(IllegalArgumentException.class, () -> MiddleElement2.findMiddle(arr));
    }

    @Test
    public void testFindMiddleWithNullArraySameAsAbove() {
        int[] arr = null;
        try {
            MiddleElement2.findMiddle(arr);
            // If the method doesn't throw an exception, fail the test
            fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            // The exception was thrown as expected
        }
    }
}
