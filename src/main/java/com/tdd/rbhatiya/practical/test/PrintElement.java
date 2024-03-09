package com.tdd.rbhatiya.practical.test;

/**
 * Write a program to print numbers from 1 to 10.
 * Need to use 2 threads, one will print odd and other will print event numbers in ordered manner.
 * Thread1: 1
 * Thread2: 2
 * Thread1: 3
 * Thread2: 4
 */
public class PrintElement {
    public static void main(String[] args) {
        printElementFromThreadAltway();
    }

    public static void printElementFromThreadAltway() {
        Thread oddThread = new Thread();
        Thread evenThread = new Thread();
        oddThread.start();
        evenThread.start();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread1: " + i);
            } else
                System.out.println("Thread2: " + i);
        }
    }

}
