package com.tw.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldHaveCurrentValueSameAsInputForFirstAddition() {
        assertEquals(new Calculator().add(5.0), 5.0,0.0);
    }

}