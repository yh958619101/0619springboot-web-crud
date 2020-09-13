package com.yh.service.impl;
import com.yh.dao.EmployeeDao;
import com.yh.entity.Employee;
import com.yh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> getEmployees(){
        List<Employee> empls = employeeDao.getEmpls();
        return empls;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }
}
