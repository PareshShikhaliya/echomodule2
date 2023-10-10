package class3;

import org.example.class3.ShoppingCart7;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShoppingCartTest {

    private ShoppingCart7 cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart7();
    }

    @AfterEach
    public void tearDown() {
        cart = null;
    }

    @Test
    @Order(1)
    public void testAddItem() {
        cart.addItem("Product A", 10.0);
        cart.addItem("Product B", 20.0);
        assertEquals(2, cart.getItemCount());
    }

    @Test
    @Order(2)
    public void testRemoveItem() {
        cart.addItem("Product A", 10.0);
        cart.addItem("Product B", 20.0);
        cart.removeItem("Product A");
        assertEquals(1, cart.getItemCount());
    }

    @Test
    @Order(3)
    public void testCalculateTotalPrice() {
        cart.addItem("Product A", 10.0);
        cart.addItem("Product B", 20.0);
        assertEquals(30.0, cart.calculateTotalPrice());
    }
}
