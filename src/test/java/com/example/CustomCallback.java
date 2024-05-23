package com.example;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class CustomCallback extends TestBase implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL).
                getOrComputeIfAbsent(this.getClass(),
                        k -> {
                            beforeAllTests(context);
                            return (ExtensionContext.Store.CloseableResource) this::afterAllTests;
                        }
                );
    }

    public void beforeAllTests(ExtensionContext context) {
        im = new ImportantManager();
    }

    public void afterAllTests() {
        im.stop();
        im = null;
    }
}
