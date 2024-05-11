package com.example.AlBD.repository;

import com.example.AlBD.dto.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CommonRepository<Country> {


}