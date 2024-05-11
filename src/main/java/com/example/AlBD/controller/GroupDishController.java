package com.example.AlBD.controller;

import com.example.AlBD.dto.Feedback;
import com.example.AlBD.dto.GroupDish;
import com.example.AlBD.service.FeedbackService;
import com.example.AlBD.service.GroupDishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groupdishes")
public class GroupDishController extends AbstractController<GroupDish, GroupDishService> {
    @Autowired
    public GroupDishController(GroupDishService service) {
        super(service);
    }
}