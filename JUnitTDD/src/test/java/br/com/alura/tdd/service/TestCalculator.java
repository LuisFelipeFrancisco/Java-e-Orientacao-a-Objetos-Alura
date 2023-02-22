package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Calculator;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 7);
        System.out.println(result);

        result = calculator.add(0, 0);
        System.out.println(result);

        result = calculator.add(-3, 7);
        System.out.println(result);
    }
    
}