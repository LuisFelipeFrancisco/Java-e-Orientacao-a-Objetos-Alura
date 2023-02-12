package tests;
import models.Calculator;

public class TestsCalculator {

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
