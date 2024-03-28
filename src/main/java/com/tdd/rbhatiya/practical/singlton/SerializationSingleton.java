package com.tdd.rbhatiya.practical.singlton;

import java.io.Serial;
import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private static SerializationSingleton instance=null;
    private SerializationSingleton(){}

    public static SerializationSingleton getInstance() {
        if (instance == null) {
            instance = new SerializationSingleton();
        }
        return instance;
    }
    @Serial
    protected Object readResolve() {
        return instance;
    }
}
