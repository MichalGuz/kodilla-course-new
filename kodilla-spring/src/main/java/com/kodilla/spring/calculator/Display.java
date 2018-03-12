package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private double val;

    void displayValue(double val) {
        System.out.println("Value = " + val);
    }

}
