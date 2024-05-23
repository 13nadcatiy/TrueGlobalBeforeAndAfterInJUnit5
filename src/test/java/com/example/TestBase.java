package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomCallback.class)
public class TestBase {

    public static ImportantManager im;

    @BeforeEach
    public void beforeTest() {
        System.out.println("start some test");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("stop some test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("start some test-class");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("stop some test-class");
    }
}
