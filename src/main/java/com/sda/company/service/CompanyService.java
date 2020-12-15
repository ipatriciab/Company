package com.sda.company.service;

import com.sda.company.models.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    Company create(Company company);

    List<Company> getAll();

    // metoda de delete nu returneaza nimic, sterge un item in functie de id
    void DeleteById(Integer id);

    // metoda de findById, ne returneaza un obiect in functie de id
    Optional<Company> findById(Integer id);

    Company update(Company company);
}
