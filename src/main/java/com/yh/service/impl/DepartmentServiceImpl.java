package com.yh.service.impl;

import com.yh.dao.DepartmentDao;
import com.yh.entity.Department;
import com.yh.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao deparmentDao;

    @Override
    public List<Department> getDepartments() {
        return deparmentDao.getDepartments();
    }
}
