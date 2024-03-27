package com.tdd.rbhatiya.practical.threads;

public class FileRunThread implements Runnable{
    @Override
    public void run() {
        System.out.println("This is runnable interface");
        throw new RuntimeException("Error orrcured while executing thread");
    }
}
