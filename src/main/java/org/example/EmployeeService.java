package org.example;

import java.util.*;

public interface EmployeeService {

    Employee add();

    void remove(String firstName, String secondName, String department, double salary);

    void find(String firstName, String secondName, String department, double salary);

    Collection<Employee> findAll();
    Collection<Employee> fullList();
}