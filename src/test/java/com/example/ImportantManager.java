package com.example;

public class ImportantManager {

    private static ImportantManager instance;

    String start = "Запускается важный менеджер";
    String stop = "Важный менеджер останавливается";

    public ImportantManager() {
        System.out.println(start);
    }

    public void stop() {
        System.out.println(stop);
    }
}
