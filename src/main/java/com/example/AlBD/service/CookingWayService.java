package com.example.AlBD.service;

import com.example.AlBD.dto.CookingWay;
import com.example.AlBD.dto.Season;
import com.example.AlBD.repository.CookingWayRepository;
import com.example.AlBD.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CookingWayService extends AbstractService<CookingWay, CookingWayRepository> {

    @Autowired
    public CookingWayService(CookingWayRepository repository) {
        super(repository);
    }
}