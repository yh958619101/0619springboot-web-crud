package com.yh.service;
import com.yh.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();

    void addEmployee(Employee employee);
}
