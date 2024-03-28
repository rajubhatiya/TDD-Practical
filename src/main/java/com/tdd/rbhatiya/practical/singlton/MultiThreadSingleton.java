package com.tdd.rbhatiya.practical.singlton;

public class MultiThreadSingleton {

    private static MultiThreadSingleton instance;

    private MultiThreadSingleton() {}

    private static MultiThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}
