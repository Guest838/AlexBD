package com.example.AlBD.service;

import com.example.AlBD.dto.Feedback;
import com.example.AlBD.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService extends AbstractService<Feedback, FeedbackRepository> {
    @Autowired
    public FeedbackService(FeedbackRepository repository) {
        super(repository);
    }
}