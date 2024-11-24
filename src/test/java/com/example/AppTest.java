package com.example;

import org.junit.Assert;
import org.junit.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;

public class AppTest {

    @Test
    @Description("Проверка работы метода add() с положительными числами")
    @Feature("Calculator")
    public void testAdd() {
        App app = new App();
        int result = app.add(2, 3);
        Assert.assertEquals(5, result);
    }
}
