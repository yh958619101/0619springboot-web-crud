package com.yh.web;
import com.yh.entity.Department;
import com.yh.entity.Employee;
import com.yh.service.DepartmentService;
import com.yh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService  employeeService ;
    @Autowired
    private DepartmentService departmentService;
    /**
     * 获取员工列表 ，get方式
     * @return
     */
    @RequestMapping(value="/emps",method ={RequestMethod.GET} )
//    @GetMapping("/emps")
    public String getEmployees(Model model)  {
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("lists",employees);
        return "list";
    }
    @GetMapping("/emp1")
    public String toAddEmployee(Model model){
        List<Department> departments  = departmentService.getDepartments();
        model.addAttribute("departments",departments);
        return "add_employee";
    }

    @PostMapping("/emp")
    public String addEmployye(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/emps";
    }

}
