package com.tdd.rbhatiya.practical.threads;

public class PrintEventNumber {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even number : " + i);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd number : " + i);
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
