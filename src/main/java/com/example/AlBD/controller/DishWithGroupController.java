package com.example.AlBD.controller;

import com.example.AlBD.dto.DishWithGroup;
import com.example.AlBD.dto.Feedback;
import com.example.AlBD.service.DishWithGroupService;
import com.example.AlBD.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dishwithgroups")
public class DishWithGroupController extends AbstractController<DishWithGroup,DishWithGroupService> {
    @Autowired
    public DishWithGroupController(DishWithGroupService service) {
        super(service);
    }
}