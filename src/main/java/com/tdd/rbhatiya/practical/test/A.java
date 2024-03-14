package com.tdd.rbhatiya.practical.test;

public interface A extends  B {
    default void check(){
        System.out.println("Printing from A");
    }
}
