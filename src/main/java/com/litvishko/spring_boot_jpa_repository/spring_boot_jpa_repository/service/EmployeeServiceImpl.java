package com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.service;



import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.dao.EmployeeRepository;
import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public List<Employee> showAllEmps() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public void addEmp(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee showEmp(int id) {

        Employee employee = null;
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()) {
            employee = optional.get();
        }

        return employee;
    }

    @Override
    @Transactional
    public void deleteEmp(int id) {
        employeeRepository.deleteById(id);
    }
}
