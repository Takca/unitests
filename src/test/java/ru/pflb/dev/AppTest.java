package ru.pflb.dev;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void assertsHelloWorld() {
        App app = new App();
        Assert.assertEquals("Hello World!", app.getHelloWorld());
    }

}
