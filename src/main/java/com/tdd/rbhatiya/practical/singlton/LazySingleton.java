package com.tdd.rbhatiya.practical.singlton;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    public static LazySingleton instance;
    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
