package com.sda.company.service.impl;

import com.sda.company.models.Company;
import com.sda.company.repository.CompanyRepository;
import com.sda.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImlp implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImlp(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company create(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public List<Company> getAll() {
        return (List<Company>) companyRepository.findAll();
    }

    @Override
    public void DeleteById(Integer id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Optional<Company> findById(Integer id) {
        return companyRepository.findById(id);
    }

    // am folosit Optional sa verifice daca exista sau nu obiectul
    @Override
    public Company update(Company company) {
        return  companyRepository.save(company);
    }
}
