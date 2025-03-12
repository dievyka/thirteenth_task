package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Multiplier implements Operation {
    @Override
    public double getResult(double a, double b) {
        System.out.print("Результат умножения a и b: ");
        return a * b;
    }
}
