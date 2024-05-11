package com.example.AlBD.repository;
import com.example.AlBD.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CommonRepository<Product> {


}
