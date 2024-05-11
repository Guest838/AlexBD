package com.example.AlBD.service;
import com.example.AlBD.dto.Recipe;
import com.example.AlBD.repository.ProductRepository;
import com.example.AlBD.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService extends AbstractService<Recipe, RecipeRepository> {
    @Autowired
    public RecipeService(RecipeRepository repository) {
        super(repository);
    }
}