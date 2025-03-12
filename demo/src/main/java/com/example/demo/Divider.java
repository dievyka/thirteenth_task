package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Divider implements Operation {
    @Override
    public double getResult(double a, double b) {
        System.out.print("Результат деления a и b: ");
        return a / b;
    }
}
