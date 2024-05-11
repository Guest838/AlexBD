package com.example.AlBD.repository;
import com.example.AlBD.Dish;
import com.example.AlBD.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {


}