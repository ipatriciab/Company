package com.sda.company.service;

import com.sda.company.models.Company;

import java.util.List;

public interface CompanyService {

    Company create(Company company);

    List<Company> getAll();
}
