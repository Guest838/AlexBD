package com.example.AlBD.controller;

import com.example.AlBD.Dish;
import com.example.AlBD.Recipe;
import com.example.AlBD.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/recipes")
public class RecipeController {



    private final RecipeRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
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
    public ResponseEntity<Recipe> getRecipeByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<Recipe> updateRecipeByID(Integer id, @RequestBody Recipe recipe)
    {

        if (repo.findById(id).isPresent())
        {
            Recipe result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setId(recipe.getId());
            result.setIdDish(recipe.getIdDish());
            result.setIdProduct(recipe.getIdProduct());
            result.setCookingWay(recipe.getCookingWay());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteRecipeByID(int id) {
        repo.deleteById(id);
    }


}