package com.example.AlBD.controller;
import com.example.AlBD.dto.Feedback;
import com.example.AlBD.dto.Product;
import com.example.AlBD.repository.ProductRepository;
import com.example.AlBD.service.FeedbackService;
import com.example.AlBD.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController extends AbstractController<Product, ProductService> {
    @Autowired
    public ProductController(ProductService service) {
        super(service);
    }
}





