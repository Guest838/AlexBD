package com.example.AlBD.repository;
import com.example.AlBD.dto.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends CommonRepository<Dish>{


}