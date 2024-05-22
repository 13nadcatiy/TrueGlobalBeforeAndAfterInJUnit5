package com.example;

public class TestBase {

    public static ImportantManager im;

    //@BeforeMethod
    public void beforeTest() {
        im = new ImportantManager();
    }

    //@AfterMethod
    public void afterTest() {
        im.stop();
    }

    //@BeforeTest
    public static void beforeAll() {
        im = new ImportantManager();
    }

    //@AfterTest
    public static void afterAll() {
        im.stop();
    }
}
