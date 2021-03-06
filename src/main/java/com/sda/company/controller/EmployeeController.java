package com.sda.company.controller;

import com.sda.company.models.Employee;
import com.sda.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController (EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.create(employee));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }
    @DeleteMapping("/deleteById")
    public void deleteById(Integer id) {
        employeeService.deleteById(id);
    }

    @GetMapping("/findById")
    public Optional<Employee> findById(Integer id) {
        return employeeService.findById(id);
    }

    @PutMapping("/update")
    public  ResponseEntity<Employee> update(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.update(employee));
    }
}
