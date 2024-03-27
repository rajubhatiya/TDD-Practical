package com.tdd.rbhatiya.practical.threads;

import com.tdd.rbhatiya.practical.utility.Employee;

import java.util.concurrent.Callable;

public class FileCallThread implements Callable<Employee> {
    @Override
    public Employee call() throws Exception {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Raj");
        employee.setAge("25");
        return employee;
    }
}
