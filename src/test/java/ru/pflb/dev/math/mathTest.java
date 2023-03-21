package ru.pflb.dev.math;

import org.junit.Assert;
import org.junit.Test;

public class mathTest {

    @Test
    public void trueSumTest() {
        Calc calc = new CalcSum();
        Assert.assertEquals(7, calc.calc(2, 5));
    }

    @Test
    public void falseSumTest() {
        Calc calc = new CalcSum();
        Assert.assertEquals(6, calc.calc(2, 5));
    }

    @Test
    public void trueDifferenceTest() {
        Calc calc = new CalcDifference();
        Assert.assertEquals(-3, calc.calc(2, 5));
    }

    @Test
    public void falseDifferenceTest() {
        Calc calc = new CalcDifference();
        Assert.assertEquals(3, calc.calc(2, 5));
    }


}
