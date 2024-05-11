package com.example.AlBD.service;

import com.example.AlBD.dto.Feedback;
import com.example.AlBD.dto.Product;
import com.example.AlBD.repository.FeedbackRepository;
import com.example.AlBD.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends AbstractService<Product, ProductRepository> {
    @Autowired
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}