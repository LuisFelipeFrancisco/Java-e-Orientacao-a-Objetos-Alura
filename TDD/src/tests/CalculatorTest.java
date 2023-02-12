package tests;

import org.junit.Test;
import org.junit.Assert;

import models.Calculator;

public class CalculatorTest {

    @Test
    public void testAddPositive() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 7);
        
        Assert.assertEquals(10, result);
    }

    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);

        Assert.assertEquals(0, result);
    }

    @Test
    public void testAddNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-3, 7);

        Assert.assertEquals(4, result);
    }
    
}

/*
 * Convention: 
 * 1. Method names should be descriptive of what they do.
 * 2. Method names should be in camelCase.
 * 3. Method names should start with a verb.
 * ...
 * 
 * @Test annotation:
 * 1. Indicates that a method is a test method.
 * 2. Test methods must be public.
 * 3. Test methods must not return a value.
 * ...
 * 
 * Assert. methods:
 * 1. assertEquals(expected, actual)
 * 2. assertTrue(boolean)
 * 3. assertFalse(boolean)
 * 4. assertNull(Object)
 * ...
 */