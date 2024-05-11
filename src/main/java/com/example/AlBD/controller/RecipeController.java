package com.example.AlBD.controller;

import com.example.AlBD.dto.Product;
import com.example.AlBD.dto.Recipe;
import com.example.AlBD.repository.RecipeRepository;
import com.example.AlBD.service.ProductService;
import com.example.AlBD.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController extends AbstractController<Recipe, RecipeService> {
    @Autowired
    public RecipeController(RecipeService service) {
        super(service);
    }
}
