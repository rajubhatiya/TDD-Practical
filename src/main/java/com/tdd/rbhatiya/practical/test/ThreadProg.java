package com.tdd.rbhatiya.practical.test;

import java.util.ArrayList;
import java.util.List;

public class ThreadProg {
    public static void main(String[] args) {
        print();
    }
    public static void print() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println("-- "+i);
                    }
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 != 0) {
                        System.out.println("-- "+i);
                    }
                }
            }
        });
        t1.start();
        t2.start();

        List<Thread> threads = new ArrayList<>();
        threads.add(t1);
        threads.add(t2);

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
