package ru.pflb.dev.math;

import org.junit.Assert;
import org.junit.Test;

public class mathTest {

    @Test
    public void twoFiveSeven() {
        Calc calc = new CalcSum();
        Assert.assertEquals(7, calc.calc(2, 5));
    }

    @Test
    public void threeFiveEight() {
        Calc calc = new CalcSum();
        Assert.assertEquals(8, calc.calc(3, 5));
    }

    @Test
    public void twoFiveMinusThree() {
        Calc calc = new CalcDifference();
        Assert.assertEquals(-3, calc.calc(2, 5));
    }

    @Test
    public void fiveTwoThree() {
        Calc calc = new CalcDifference();
        Assert.assertEquals(3, calc.calc(5, 2));
    }


}
