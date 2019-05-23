package com.vuclip.ubs.common;

public class Context {

    private static final ThreadLocal<TestContext> userThreadLocal = new TestContextLocal();

    public static TestContext get() {
        return userThreadLocal.get();
    }

    static final class TestContextLocal extends ThreadLocal<TestContext> {

        @Override
        protected TestContext initialValue() {
            return new TestContext();
        }
    }

}