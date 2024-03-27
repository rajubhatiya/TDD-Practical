package com.tdd.rbhatiya.practical.threads;

public class ThreadExceptionHandlr implements Thread.UncaughtExceptionHandler{
private String handlerName;
    public ThreadExceptionHandlr(String handlerName){

    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(this+" "+ t.getName()+" - "+ e.getMessage());
    }
}
