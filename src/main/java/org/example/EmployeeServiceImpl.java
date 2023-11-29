package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class EmployeeServiceImpl implements EmployeeService {
    Map<String, Employee> employeesMap = new HashMap<>();
    @Override
    public Employee add () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input firstname: ");
        String firstName = scanner.nextLine();
        System.out.println("input secondname: ");
        String secondName = scanner.nextLine();
        System.out.println("input department: ");
        String department = scanner.nextLine();
        System.out.println("input salary: ");
        double salary = scanner.nextDouble();
        if(!StringUtils.isAlphaSpace(firstName) || !StringUtils.isAlphaSpace(secondName) || !StringUtils.isAlphaSpace(department))
        {
            throw new RuntimeException();
        }
        firstName = StringUtils.capitalize(firstName);
        secondName = StringUtils.capitalize(secondName);
        department = StringUtils.capitalize(department);
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            throw new RuntimeException();
        }
        employeesMap.put(employee.toString(), employee);
        return employee;
    }
    @Override
    public void remove (String firstName, String secondName, String department, double salary) {
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            employeesMap.remove(employee.toString());
            return;
        }
        throw new RuntimeException();
    }
    @Override
    public void find (String firstName, String secondName, String department, double salary) {
        Employee employee = new Employee(firstName, secondName, department, salary);
        if (employeesMap.containsKey(employee.toString())) {
            employeesMap.get(employee.toString());
            return;
        }
        throw new RuntimeException();
    }
    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employeesMap.values());
    }
    @Override
    public Collection<Employee> fullList() {
        return Collections.unmodifiableCollection(this.employeesMap.values());
    }
}
