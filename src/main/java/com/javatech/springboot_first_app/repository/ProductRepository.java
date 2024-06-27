package com.javatech.springboot_first_app.repository;

import com.javatech.springboot_first_app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
