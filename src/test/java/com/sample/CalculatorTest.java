package com.sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc;

    @BeforeAll
    static void execute1() {
        System.out.println("Executing Before All");
    }

    @AfterAll
    static void execute2() {
        System.out.println("Executing After All");
    }

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("Before running the Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After running the Test");
    }

    @Test
    void add() {
        int result=calc.add(10,15);
        assertEquals(25,result);
        System.out.println("Test completed for add()");
        //fail("Failed");
    }

    @Test
    void sumOfNatualNumber() {

        int result = calc.sumOfNatualNumber(10);
        assertEquals(55,result);
        System.out.println("Test completed for sumOfNatualNumber()");
        //fail("Failed");
    }

    @Test
    void sumOfOddNumberForNTerms() {
        //1+3+5;
        int result = calc.sumOfOddNumberForNTerms(3);
        assertEquals(9,result);
        System.out.println("Test completed for sumOfOddNumberForNTerms()");
        //fail("Failed");
    }
}