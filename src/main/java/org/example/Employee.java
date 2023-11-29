package org.example;


import org.apache.commons.lang3.StringUtils;

public class Employee {
    private final String firstName;
    private final String secondName;
    private final String department;
    private final double salary;



    public Employee(String firstName, String secondName, String department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
    }

    public  String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ФИО: " + getFirstName() + " " + getSecondName() + ", отдел: " + department + ", зарплата: " + salary;
    }

}