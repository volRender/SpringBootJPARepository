package com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.controller;


import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.entity.Employee;
import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {

        List<Employee> emps = employeeService.showAllEmps();
        return emps;

    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmp(id);

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody Employee employee) {

        employeeService.addEmp(employee);

        return employee;

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {

        employeeService.addEmp(employee);

        return employee;

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {

        Employee employee = employeeService.showEmp(id);
        employeeService.deleteEmp(id);

        return "Employee with id = " + id + " was deleted.";

    }
}
