package org.example;


import java.util.List;
import java.util.Map;

public interface DepartmentService {
    List<Employee> getDepartment (String department);
    Employee getMaxSalaryInDepartment(String department);

    Employee getMinSalaryInDepartment(String department);

    Map<String, List<Employee>> getFullDep();
}
