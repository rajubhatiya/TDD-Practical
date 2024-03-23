package com.tdd.rbhatiya.practical.threads;

import java.util.concurrent.Callable;

public class PrintEvenOddNumCallable {
    public static void main(String[] args) {
        PrintEvenOddNumCallable printEvenOddNumCallable = new PrintEvenOddNumCallable();
        EvenOddCallable evenOddCallable = printEvenOddNumCallable.new EvenOddCallable();
        try {
            evenOddCallable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class EvenOddCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Number : " + i);
                } else {
                    System.out.println("Odd Number : " + i);
                }
            }
            return 0;
        }
    }
}
