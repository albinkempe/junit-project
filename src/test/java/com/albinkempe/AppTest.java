package com.albinkempe;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(1, App.add(1, 0));
        assertEquals(0, App.add(0, 0));
        assertEquals(-1, App.add(-2, 1));
    }
}
