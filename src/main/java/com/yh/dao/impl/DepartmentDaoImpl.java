package com.yh.dao.impl;
import com.yh.dao.DepartmentDao;
import com.yh.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DepartmentDaoImpl implements DepartmentDao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Department> getDepartments() {
        String sql ="select * from department";
        List<Department> query = template.query(sql, new BeanPropertyRowMapper<Department>(Department.class));
        return query;
    }
}
