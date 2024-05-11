package com.example.AlBD.controller;
import com.example.AlBD.dto.Dish;
import com.example.AlBD.repository.DishRepository;
import com.example.AlBD.service.DishService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



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
@RequestMapping("/dishes")
public class DishController extends AbstractController<Dish, DishService> {
    @Autowired
    public DishController(DishService service) {
        super(service);
    }
}

