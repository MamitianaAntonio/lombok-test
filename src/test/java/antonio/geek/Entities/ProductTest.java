package antonio.geek.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    Product product1;
    Product product2;

    @BeforeEach
    public void setup() {
        product1 = new Product("Keyboard", 500.0, 2);
        product2 = new Product("Mouse", 300.0, 1);
    }

    @Test
    public void testAddStock() {
        product1.addStock(5);
        assertEquals(7, product1.getQuantity());
    }

    @Test
    public void testRemoveStock() {
        product1.removeStock(1);
        assertEquals(1, product1.getQuantity());
    }

    @Test
    public void testRemoveStockWithException() {
        assertThrows(IllegalArgumentException.class, () -> product2.removeStock(6));
    }
}