package com.example.AlBD.controller;

import com.example.AlBD.dto.CookingWay;
import com.example.AlBD.dto.Country;
import com.example.AlBD.repository.CountryRepository;
import com.example.AlBD.service.CookingWayService;
import com.example.AlBD.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/countries")
public class CountryController extends AbstractController<Country, CountryService> {
    @Autowired
    public CountryController(CountryService service) {
        super(service);
    }
}