package com.example.thymeleaf.Services;

import com.example.thymeleaf.Models.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
