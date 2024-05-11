package com.example.AlBD.controller;

import com.example.AlBD.dto.CookingWay;
import com.example.AlBD.repository.CookingWayRepository;
import com.example.AlBD.service.CookingWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/cookingways")
public class CookingWayController extends AbstractController<CookingWay, CookingWayService> {
    @Autowired
    public CookingWayController(CookingWayService service) {
        super(service);
    }


}
