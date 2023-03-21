package ru.pflb.dev.other;

import org.junit.Assert;
import org.junit.Test;
import ru.pflb.dev.math.Calc;
import ru.pflb.dev.math.CalcSum;

public class otherTest {

    @Test
    public void trueTest() {
        StringGetter getter = new StringGetter();
        Assert.assertEquals("Hello world!", getter.getString());
    }

    @Test
    public void falseTest() {
        StringGetter getter = new StringGetter();
        Assert.assertEquals("Hello world", getter.getString());
    }

}
