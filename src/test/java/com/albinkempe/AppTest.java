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

    /**
     * Test add(a, b) function. Should add integer a and b and output the result.
     */
    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
        assertEquals(1, App.add(1, 0));
        assertEquals(0, App.add(0, 0));
        assertEquals(-1, App.add(-2, 1));
    }

    /**
     * Test sub(a, b) function. Should subtract integer b from a and output the
     * result.
     */
    @Test
    public void testSub() {
        assertEquals(-1, App.sub(2, 3));
        assertEquals(1, App.sub(1, 0));
        assertEquals(0, App.sub(0, 0));
        assertEquals(-3, App.sub(-2, 1));
    }

    /**
     * Test mul(a, b) function. Should multiply integer a and b and output the
     * result.
     */
    @Test
    public void testMul() {
        assertEquals(4, App.mul(2, 2));
        assertEquals(2, App.mul(2, 1));
        assertEquals(0, App.mul(5, 0));
        assertEquals(10, App.mul(-5, -2));
    }
}
