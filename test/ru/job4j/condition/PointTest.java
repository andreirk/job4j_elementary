package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int out = (int) Point.distance(0, 0, 10, 0);
        int expected = 10;

        assertEquals(out, expected);
    }
}