package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    public static ImportantManager im;

    //@BeforeEach
    public void beforeTest() {
        im = new ImportantManager();
    }

    //@AfterEach
    public void afterTest() {
        im.stop();
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("start some test-class");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("done some test-class");
    }
}
