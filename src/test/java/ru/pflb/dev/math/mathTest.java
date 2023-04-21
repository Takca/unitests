package ru.pflb.dev.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathTest {

    @Test
    @DisplayName(value = "Test 2 + 5 = ?")
    public void twoFiveSeven() {
        Calc calc = new CalcSum();
        assertEquals(7, calc.calc(2, 5));
    }

    @Test
    @DisplayName("Test 3 + 5 = ?")
    public void threeFiveEight() {
        Calc calc = new CalcSum();
        assertEquals(8, calc.calc(3, 5));
    }

    @Test
    @DisplayName("Test 2 - 3 = ?")
    public void twoFiveMinusThree() {
        Calc calc = new CalcDifference();
        assertEquals(-3, calc.calc(2, 5));
    }

    @Test
    @DisplayName("Test 5 - 2 = ?")
    public void fiveTwoThree() {
        Calc calc = new CalcDifference();
        assertEquals(3, calc.calc(5, 2));
    }


}
