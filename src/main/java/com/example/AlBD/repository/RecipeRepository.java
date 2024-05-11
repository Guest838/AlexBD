package com.example.AlBD.repository;
import com.example.AlBD.dto.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CommonRepository<Recipe> {


}
