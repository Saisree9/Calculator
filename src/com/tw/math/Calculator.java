package com.tw.math;

public class Calculator {
    private double currentValue;

    public Calculator() {
        this.currentValue = 0.0;
    }

    public double add(double input) {
        currentValue += input;
        return currentValue;
    }


}
