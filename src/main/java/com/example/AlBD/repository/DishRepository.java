package com.example.AlBD.repository;
import com.example.AlBD.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Integer> {


}