package com.example;

import org.junit.jupiter.api.Test;

public class FirstTestsClass extends TestBase {

    @Test
    public void test1_1() {
        outputInfo();
        //someMethod();
    }

    private void someMethod() {
        System.out.println("-Внутренний метод теста-");
    }

    @Test
    public void test1_2() {
        outputInfo();
    }

    @Test
    public void test1_3() {
        outputInfo();
    }
}