package com.tdd.rbhatiya.practical.test;

/**
 * Write a program to print numbers from 1 to 10.
 * Need to use 2 threads, one will print odd and other will print event numbers in ordered manner.
 * Thread1: 1
 * Thread2: 2
 * Thread1: 3
 * Thread2: 4
 */
public class PrintEvenOddElementUsingThread {
    public static void main(String[] args) {
        printElements();
    }
    public static void printElements(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if(i%2 != 0) {
                        System.out.println("Thread1: " + i);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
           public void run(){
               for (int i = 1; i <= 10; i++) {
                   if(i%2 == 0) {
                       System.out.println("Thread2: " + i);
                   }
               }
           }
        });
        t1.start();
        t2.start();
    }
}
