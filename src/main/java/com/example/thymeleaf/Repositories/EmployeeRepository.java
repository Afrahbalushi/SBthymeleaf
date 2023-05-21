package com.example.thymeleaf.Repositories;

import com.example.thymeleaf.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {



}
