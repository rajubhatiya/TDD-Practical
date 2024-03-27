package com.tdd.rbhatiya.practical.threads;

import com.tdd.rbhatiya.practical.utility.Employee;

import java.util.concurrent.*;

public class ExeSrvc {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FileRunThread t1 = new FileRunThread();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.execute(t1);

        FileCallThread  t2 = new FileCallThread();
        Future<Employee> future= executor.submit(t2);
        Employee employee = future.get();
        System.out.println(employee.getName());

        executor.shutdown();
    }
}
