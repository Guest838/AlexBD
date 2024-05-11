package com.example.AlBD.controller;
import com.example.AlBD.dto.Dish;
import com.example.AlBD.dto.Feedback;
import com.example.AlBD.repository.FeedbackRepository;
import com.example.AlBD.service.DishService;
import com.example.AlBD.service.FeedbackService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/feedbacks")
public class FeedbackController extends AbstractController<Feedback, FeedbackService> {
    @Autowired
    public FeedbackController(FeedbackService service) {
        super(service);
    }
}




