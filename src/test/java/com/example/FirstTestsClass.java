package com.example;

import org.junit.jupiter.api.Test;

public class FirstTestsClass extends TestBase {

    @Test
    public void test1() {
        System.out.print("Класс 1, ");
        someMethod();
    }

    private void someMethod() {
        System.out.println("Тест 1");
    }

    @Test
    public void test2() {
        System.out.println("Класс 1, Тест 2");
    }

    @Test
    public void test3() {
        System.out.println("Класс 1, Тест 3");
    }
}
