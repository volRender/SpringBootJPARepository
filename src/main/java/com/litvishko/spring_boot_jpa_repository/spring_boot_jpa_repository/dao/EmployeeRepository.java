package com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.dao;




import com.litvishko.spring_boot_jpa_repository.spring_boot_jpa_repository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
