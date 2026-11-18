/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.salesreportapp.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    private Product product;

    @BeforeEach
    void setUp() {
        // Sample data from the question
        String[] names = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        int[][] sales = {
            {25, 18, 20},   // Cozy  → 63
            {15, 10, 12},   // Restonic → 37
            {18, 15, 20}    // Sealy → 53
        };

        product = new Product(names, sales);
    }

    // Unit Test 1
    @Test
    void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int expected = 153;   // 63 + 37 + 53
        int actual = product.GetTotalProductsSold();
        assertEquals(expected, actual);
    }

    // Unit Test 2
    @Test
    void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        double expected = 17.0;   // 153 / 9
        double actual = product.GetAverageProductSold();
        assertEquals(expected, actual, 0.001);
    }
}
