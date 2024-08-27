package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    public static ImportantManager manager;
    public static int beforeEach = 0;
    public static int afterEach = 0;
    public static int beforeAll = 0;
    public static int afterAll = 0;

    public static int testCount = 0;
    public static int classCount = 0;

    public void outputInfo() {
        System.out.println(String.format("Класс %d, Тест %d", classCount, testCount));
    }

    //@BeforeEach
    public void beforeEach() {
        System.out.println("---@BeforeEach---: " + beforeEach);
    }

    //@AfterEach
    public void afterEach() {
        System.out.println("---@AfterEach----: " + afterEach);
    }

    //@BeforeAll
    public static void beforeAll() {
        System.out.println("-----@BeforeAll-----: " + beforeAll);
    }

    //@AfterAll
    public static void afterAll() {
        System.out.println("-----@AfterAll------: " + afterAll);
    }
}