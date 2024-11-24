package com.example;

import org.junit.Assert;
import org.junit.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;

public class CalculatorTest {

    @Test
    @Description("Проверка работы метода add() с положительными числами")
    @Feature("Calculator")
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    @Description("Проверка работы метода subtract() с положительными числами")
    @Feature("Calculator")
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(2, result);
    }

    @Test
    @Description("Проверка работы метода multiply() с положительными числами")
    @Feature("Calculator")
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(4, 3);
        Assert.assertEquals(12, result);
    }

    @Test
    @Description("Проверка работы метода divide() с положительными числами")
    @Feature("Calculator")
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6, 3);
        Assert.assertEquals(2.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    @Description("Проверка обработки деления на ноль в методе divide()")
    @Feature("Calculator")
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(5, 0);
    }
}