package com.sda.company.service;

import com.sda.company.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee create(Employee employee);

    List<Employee> getAll();

    // metoda deleteById
    void deleteById(Integer id);

    // metoda de findById, ne returneaza un obiect in functie de id
    Optional<Employee> findById(Integer id);

    Employee update(Employee employee);
}
