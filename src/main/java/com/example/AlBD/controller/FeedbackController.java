package com.example.AlBD.controller;
import com.example.AlBD.Feedback;
import com.example.AlBD.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/feedbacks")
public class FeedbackController {



    private final FeedbackRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Feedback>> getAllFeedbacks() {
        var result=repo.findAll();
        if (!result.isEmpty())
        {
            return ResponseEntity.ok(result);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping(value = "/getByID")
    public ResponseEntity<Feedback> getFeedbackByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<Feedback> updateFeedbackByID(Integer id, @RequestBody Feedback feedback)
    {

        if (repo.findById(id).isPresent())
        {
            Feedback result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setDescription(feedback.getDescription());
            result.setScore(feedback.getScore());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteFeedbackByID(int id) {
        repo.deleteById(id);
    }


}



