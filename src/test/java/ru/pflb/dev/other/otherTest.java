package ru.pflb.dev.other;

import org.junit.Assert;
import org.junit.Test;

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
