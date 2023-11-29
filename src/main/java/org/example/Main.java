package org.example;

public class Main {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.add();
        System.out.println(employeeService.fullList().toString());
    }
}