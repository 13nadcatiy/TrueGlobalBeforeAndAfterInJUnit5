package com.example;

public class ImportantManager {

    public static int instanceCount = 0;

    String start = "Запускается важный менеджер";
    String stop = "Важный менеджер останавливается";

    public ImportantManager() {
        System.out.println(start);
        instanceCount++;
    }

    public void stop() {
        System.out.println(stop);
    }
}