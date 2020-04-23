package ru.job4j.calculator;

import org.junit.Test;


import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        int in = 170;
        double expected = Fit.manWeight(in);
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.1);

    }

    @Test
    public void womanWeight() {

    }
}