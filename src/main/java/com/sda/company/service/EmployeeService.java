package com.sda.company.service;

import com.sda.company.models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee employee);

    List<Employee> getAll();
}
