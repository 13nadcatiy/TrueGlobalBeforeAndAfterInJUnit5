package com.example;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class CustomListener extends TestBase implements TestExecutionListener {
    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        //тут вызывать все что надо перед тестами
        im = new ImportantManager();
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        //тут вызывать все что надо после тестов
        im.stop();
        im = null;
    }
}
