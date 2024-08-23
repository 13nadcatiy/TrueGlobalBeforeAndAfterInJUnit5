package com.example;

public class TestBase {

    public static ImportantManager manager;

    //@BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    //@AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    //@BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    //@AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll");
    }
}
