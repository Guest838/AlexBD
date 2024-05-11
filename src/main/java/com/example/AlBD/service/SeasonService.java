package com.example.AlBD.service;

import com.example.AlBD.dto.Season;
import com.example.AlBD.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService extends AbstractService<Season, SeasonRepository> {
    @Autowired
    public SeasonService(SeasonRepository repository) {
        super(repository);
    }
}