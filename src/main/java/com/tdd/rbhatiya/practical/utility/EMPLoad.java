package com.tdd.rbhatiya.practical.utility;

import java.util.*;
import java.util.stream.Collectors;

public class EMPLoad {
    public static void main(String[] args) {
        highestSalary();
        highestSalary1();
        System.out.println("Hello World!");
    }

    public static List<Employee> loadEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee( 1,"Rajesh", "Bhatiya",50000));
        employeeList.add(new Employee( 1,"Manish", "Chaudhary",40000));
        employeeList.add(new Employee( 1,"Vijay", "Patel",30000));
        employeeList.add(new Employee( 1,"Harish", "Sharma",25000));
        employeeList.add(new Employee( 1,"Rohit", "Sharma",50000));
        return employeeList;
    }

    public static List<Company> loadCompanies() {
        Employee emp = loadEmployees().stream().filter(employee -> employee.getName().equals("Rajesh")).findAny().orElse(null);

        List<Company> companyList = new ArrayList<>();
        companyList.add(new Company( 1, "TCS", emp));
        companyList.add(new Company( 1, "Infosys", loadEmployees().stream().filter(employee -> employee.getName().equals("Vijay")).findAny().orElse(null)));

        return companyList;
    }

    public static void highestSalary() {
        loadEmployees().stream().max((o1, o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1).ifPresent(System.out::println);
    }

    public static void lowestSalary() {
        loadEmployees().stream().min((o1, o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1).ifPresent(System.out::println);
    }

    public static void highestSalary1() {
        List<Employee> sortedList = loadEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        sortedList.forEach(employee ->
                        System.out.println(employee)
                );

        Employee emp = loadEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();loadEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().get();
    }
}
