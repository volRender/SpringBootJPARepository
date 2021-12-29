package com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.service;




import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> showAllEmps();
    void addEmp(Employee employee);
    Employee showEmp(int id);
    void deleteEmp(int id);

}
