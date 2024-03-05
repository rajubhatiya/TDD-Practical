package com.tdd.rbhatiya.practical.utility;

import lombok.Data;

@Data
public class Employee {
    private String name;
    private String age;
    private Employee employee;
    public Employee getEmployee(){
        return this.employee;
    }
}
