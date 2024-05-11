package com.example.AlBD.controller;
import com.example.AlBD.Product;
import com.example.AlBD.repository.DishRepository;
import com.example.AlBD.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {



    private final ProductRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Product>> getAllProducts() {
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
    public ResponseEntity<Product> getProductByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<Product> updateProductByID(Integer id, @RequestBody Product product)
    {

        if (repo.findById(id).isPresent())
        {
            Product result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setName(product.getName());
            result.setCalorie(product.getCalorie());
            result.setPrice(product.getPrice());
            result.setMeasureUnit(product.getMeasureUnit());
            result.setCountForCalorie(product.getCountForCalorie());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteProductByID(int id) {
        repo.deleteById(id);
    }


}




