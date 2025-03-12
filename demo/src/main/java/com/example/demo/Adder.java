package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Adder implements Operation {
    @Override
    public double getResult(double a, double b) {
        System.out.print("Результат сложения a и b: ");
        return a + b;
    }
}
