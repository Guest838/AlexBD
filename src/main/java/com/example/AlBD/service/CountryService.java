package com.example.AlBD.service;

import com.example.AlBD.dto.Country;
import com.example.AlBD.dto.Season;
import com.example.AlBD.repository.CountryRepository;
import com.example.AlBD.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends AbstractService<Country, CountryRepository> {
    @Autowired
    public CountryService(CountryRepository repository) {
        super(repository);
    }
}