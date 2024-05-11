package com.example.AlBD.repository;
import com.example.AlBD.dto.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends CommonRepository<Feedback> {


}