package com.example;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class ExtensionByUstrashkin extends TestBase implements BeforeAllCallback, ExtensionContext.Store.CloseableResource {

    private static boolean firstRun = true;

    @Override
    public void beforeAll(ExtensionContext context){
        if (firstRun){
            firstRun = false;
            manager = new ImportantManager();
            context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL).put("testExt1", this);
        }
    }

    @Override
    public void close(){
        manager.stop();
        manager = null;
    }
}
