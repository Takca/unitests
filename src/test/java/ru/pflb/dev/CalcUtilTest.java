package ru.pflb.dev;

import org.junit.Assert;
import org.junit.Test;

public class CalcUtilTest {

    @Test
    public void trueSumTest() {
        Assert.assertEquals(7, CalcUtil.sum(2, 5));
    }

    @Test
    public void trueSumFalse() {
        Assert.assertEquals(6, CalcUtil.sum(2, 5));
    }

    @Test
    public void trueDifferenceTest() {
        Assert.assertEquals(-3, CalcUtil.difference(2, 5));
    }

    @Test
    public void falseDifferenceTest() {
        Assert.assertEquals(3, CalcUtil.difference(2, 5));
    }

}
