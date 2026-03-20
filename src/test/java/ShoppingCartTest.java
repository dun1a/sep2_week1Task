import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void calculateTotalCost() {
        ShoppingCart.calculateTotalCost(12.0, 2);
        assertEquals(24.0, ShoppingCart.calculateTotalCost(12.0, 2), "Total cost should be 24.0");
    }

    @Test
    void calculateTotalCost2() {
        ShoppingCart.calculateTotalCost(10.0, 3);
        assertEquals(30.0, ShoppingCart.calculateTotalCost(10.0, 3), "Total cost should be 24.0");
    }

    @Test
    void costaOfAllItems() {
        ShoppingCart.costaOfAllItems(44.0);
        assertEquals(44.0, ShoppingCart.costaOfAllItems(44.0), "Total of all items should be 44.0");
    }
}