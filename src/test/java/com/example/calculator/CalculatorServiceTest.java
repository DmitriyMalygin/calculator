package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(5, service.calculate(2, "add", 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, service.calculate(3, "subtract", 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, service.calculate(2, "multiply", 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, service.calculate(6, "divide", 3));
    }

    @Test
    void testDivisionByZero() {
        assertTrue(Double.isNaN(service.calculate(1, "divide", 0)));
    }
}
