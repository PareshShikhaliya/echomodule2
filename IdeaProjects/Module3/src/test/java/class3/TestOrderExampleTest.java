package class3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderExampleTest {

    @Test
    @Order(3)
    public void testMethodA() {
        System.out.println("Running testMethodA");
        assertEquals(2 + 3, 5);
    }



    @Test
    @Order(1)
    public void testMethodC() {
        System.out.println("Running testMethodC");
        assertTrue(true);
    }

    @Test
    @Order(2)
    public void testMethodB() {
        System.out.println("Running testMethodB");
        assertEquals("JUnit", "JUnit");
    }
}
