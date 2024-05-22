package com.example;

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

    //@BeforeAll
    public static void beforeAll() {
        im = new ImportantManager();
    }

    //@AfterAll
    public static void afterAll() {
        im.stop();
    }
}
