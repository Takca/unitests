package ru.pflb.dev.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class otherTest {

    @Test
    public void trueTest() {
        StringGetter getter = new StringGetter();
        assertEquals("Hello world!", getter.getString());
    }

}
