package com.example;

public class ImportantManager {

    private static ImportantManager instance;

    String start = "Запускается важный менеджер";
    String stop = "Важный менеджер останавливается";

    public ImportantManager() {
        System.out.println(start);
    }

    public static ImportantManager init() {
        if (instance == null) {
            instance = new ImportantManager();
        }
        return instance;
    }

    public void stop() {
        System.out.println(stop);
    }
}
