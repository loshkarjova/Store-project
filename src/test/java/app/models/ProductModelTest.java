package app.models;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProductModelTest {

    private ProductModel productModel;

    @BeforeEach
    void setUp() {
        productModel = new ProductModel();
    }

    @Test
    @DisplayName("Test calculate payment of two values is expected result.")
    void test_Calculate_Payment_Expected_Result() {
        double actual = productModel.calculatePayment(2, 5);
        assertEquals(10, actual);
    }

    @Test
    @DisplayName("Test calculate payment of two values is unexpected result.")
    void test_CalculatePayment_Unexpected_Result() {
        double actual = productModel.calculatePayment(2, 5);
        assertNotEquals(11, actual);
    }

    @AfterEach
    void tearDown() {
        productModel = null;
    }


}
