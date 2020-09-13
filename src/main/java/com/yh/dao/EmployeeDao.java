package com.yh.dao;
import com.yh.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getEmpls();

    void addEmployee(Employee employee);
}
