package com.tw.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldHaveCurrentValueSameAsInputForFirstAddition() {
        assertEquals(new Calculator().add(5.0), 5.0,0.0);
    }

    @Test
    public void shouldHaveCumulativeSumAsCurrentValueForSubsequentAdditions() {
        Calculator calculator = new Calculator();

        calculator.add(5.0);
        double result = calculator.add(10.0);

        assertEquals(10.0+5.0, result,0.0);
    }
}