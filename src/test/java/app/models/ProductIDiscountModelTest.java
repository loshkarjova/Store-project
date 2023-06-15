package app.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductIDiscountModelTest {
    private ProductIDiscountModel discountModel;

    @BeforeEach
    void setUp() {
        discountModel = new ProductIDiscountModel();
    }

    @Test
    @DisplayName("Test calculate payment of two values is expected result.")
    void test_Calculate_Payment_Expected_Result() {
        double actual = discountModel.calculatePayment(2, 4);
        assertEquals(8, actual);

    }

    @Test
    @DisplayName("Test calculate payment of two values is unexpected result.")
    void test_Calculate_Payment_Unexpected_Result() {
        double actual = discountModel.calculatePayment(6, 2);
        assertNotEquals(11, actual);
    }


    @Test
    @DisplayName("Test calculate discount is expected result. ")
    void test_Calculate_Discount_Expected_Result() {
        double actual = discountModel.calculateDiscount(12);
        assertEquals(1.2, actual);
    }

    @Test
    @DisplayName("Test calculate discount is unexpected result. ")
    void test_Calculate_Discount_Unexpected_Result() {
        double actual = discountModel.calculateDiscount(12);
        assertNotEquals(0.12, actual);
    }

    @Test
    @DisplayName("Test calculate discount payment is expected result.")
    void test_Calculate_Discount_Payment_Expected_Result() {
        double actual = discountModel.calculateDiscountPayment(10, 0.5);
        assertEquals(9.5, actual);
    }

    @Test
    @DisplayName("Test calculate discount payment is unexpected result.")
    void test_Calculate_Discount_Payment_Unexpected_Result() {
        double actual = discountModel.calculateDiscountPayment(10, 0.5);
        assertNotEquals(9.05, actual);
    }

    @AfterEach
    void tearDown() {
        discountModel = null;
    }
}
