package com.tdd.rbhatiya.practical.threads;

public class DeadLockScenario {
    public static void main(String[] args) {

        String lock1= "Rajesh";
        String lock2 = "Bhatiya";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("Thread1 acquired lock1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock2){
                        System.out.println("Thread1 acquired lock2");
                    }
                }
            }
        },"thread1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("Thread2 acquired lock2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (lock1){
                        System.out.println("Thread2 acquired lock1");
                    }
                }
            }
        },"thread2");

        thread1.start();
        thread2.start();
        System.out.println("main executed...");
    }


}
