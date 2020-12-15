package com.sda.company.controller;

import com.sda.company.models.Company;
import com.sda.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/create")
    public ResponseEntity<Company> create(@RequestBody Company company){
//        @RequestBody - primeste json, populeaza un obiect de tip company
//       wrap aplicat pe companyService.create(company)
//        trebuie facuta mereu o metoda post - metoda post are body
        return ResponseEntity.ok(companyService.create(company));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Company>> getAll(){
//        aici facem o metoda de tip get - nu are body
        return ResponseEntity.ok(companyService.getAll());
    }


    @DeleteMapping("/deleteById")
    public void DeleteById(Integer id) {
        companyService.DeleteById(id);

    }

    @GetMapping("/findById")
    public Optional<Company> findById(Integer id) {
        return companyService.findById(id);
    }

    @PutMapping("/update")
    public ResponseEntity<Company> update(@RequestBody Company company){
        return ResponseEntity.ok(companyService.update(company));
    }


}
