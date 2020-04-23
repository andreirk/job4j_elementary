package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(4, 1);
        double result3 = SqArea.square(6, 2);

        assertEquals(result1, 1, 0.1);
        assertEquals(result2, 1, 0.1);
        assertEquals(result3, 2, 0.1);
    }
}