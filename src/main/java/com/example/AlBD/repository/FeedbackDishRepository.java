package com.example.AlBD.repository;
import com.example.AlBD.dto.Dish;
import com.example.AlBD.dto.DishWithGroup;
import com.example.AlBD.dto.FeedbackDish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackDishRepository extends CommonRepository<FeedbackDish>{


}