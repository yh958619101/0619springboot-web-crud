package com.yh.dao.impl;

import com.yh.dao.EmployeeDao;
import com.yh.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private JdbcTemplate template;
    @Override
    public List<Employee> getEmpls(){
        String sql ="select * from employee";
        List<Employee> query = template.query(sql, new BeanPropertyRowMapper<Employee>(Employee.class));
        return query;
    }

    @Override
    public void addEmployee(Employee employee) {
        String sql="insert into employee (last_name,email,gender,birth,department_id) values (?,?,?,?,?)";
        int update = template.update(sql, employee.getLastName(), employee.getEmail(), employee.getGender(), employee.getBirth(), employee.getDepartmentId());
    }
}
