package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(GlobalCallBack.class)
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
