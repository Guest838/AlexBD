package com.example.AlBD.controller;
import com.example.AlBD.Dish;
import com.example.AlBD.repository.DishRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/dishes")
public class DishController {



    private final DishRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Dish>> getAllDishes() {
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
    public ResponseEntity<Dish> getDishByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<Dish> updateDishByID(Integer id, @RequestBody Dish dish)
    {

        if (repo.findById(id).isPresent())
        {
            Dish result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setId(dish.getId());
            result.setName(dish.getName());
            result.setCountry(dish.getCountry());
            result.setSeason(dish.getSeason());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteDishByID(int id) {
        repo.deleteById(id);
    }


}



