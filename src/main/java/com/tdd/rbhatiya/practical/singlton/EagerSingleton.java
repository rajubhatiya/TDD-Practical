package com.tdd.rbhatiya.practical.singlton;

public class EagerSingleton {
    public static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
