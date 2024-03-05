package com.tdd.rbhatiya.practical.utility;

public final class Company{
   private final Employee employee;
  private final String compName;
//just getter methods
    public Company(String compName, Employee employee){
        this.compName=compName;
        this.employee=employee;
    }
}
