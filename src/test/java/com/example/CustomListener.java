package com.example;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class CustomListener extends TestBase implements TestExecutionListener {
    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        im = new ImportantManager();
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        im.stop();
        im = null;
    }
}
