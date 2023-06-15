package app.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RounderTest {

    @Test
    void test_Rounder_Expected_Result() {
        assertEquals("9.56", Rounder.roundValue(9.56483));
    }

    @Test
    void test_Rounder_Unexpected_Result() {
        assertNotEquals("9.565", Rounder.roundValue(9.56483));
    }
}


