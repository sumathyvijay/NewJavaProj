package com.sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {

    Tax t;

    @BeforeEach
    void setUp() {
        t = new Tax();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testTaxCalculation() {
        double tax = t.calculateTax(100);
        assertEquals(9,tax);
    }
}
