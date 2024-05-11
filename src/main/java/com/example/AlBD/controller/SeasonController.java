package com.example.AlBD.controller;
import com.example.AlBD.dto.CookingWay;
import com.example.AlBD.dto.Season;
import com.example.AlBD.service.CookingWayService;
import com.example.AlBD.service.SeasonService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.AlBD.repository.SeasonRepository;

import java.util.List;

@RestController
@RequestMapping("/seasons")
public class SeasonController extends AbstractController<Season, SeasonService> {
    @Autowired
    public SeasonController(SeasonService service) {
        super(service);
    }

}
