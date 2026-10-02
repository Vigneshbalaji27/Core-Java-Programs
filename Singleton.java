package com.vikki.java8;

public class Singleton {

    // 1. Private constructor prevents instantiation from other classes
    private Singleton() {}

    // 2. Inner static class holds the instance
    // It is only loaded into memory when getInstance() is called
    private static class SingletonHelper {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3. Public static method provides the global access point
    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

