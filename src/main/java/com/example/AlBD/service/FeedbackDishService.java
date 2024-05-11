package com.example.AlBD.service;
import com.example.AlBD.dto.DishWithGroup;
import com.example.AlBD.dto.Feedback;
import com.example.AlBD.dto.FeedbackDish;
import com.example.AlBD.repository.DishWithGroupRepository;
import com.example.AlBD.repository.FeedbackDishRepository;
import com.example.AlBD.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackDishService extends AbstractService<FeedbackDish, FeedbackDishRepository> {
    @Autowired
    public FeedbackDishService(FeedbackDishRepository repository) {
        super(repository);
    }
}