package com.javatech.springboot_first_app.controller;

import com.javatech.springboot_first_app.entity.Product;
import com.javatech.springboot_first_app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/addProduct")
    public Product addProduct1(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public List<Product> findAllProduct(List<Product> products){
        return service.getproducts(products);
    }
    @GetMapping("/product/{id}")
    public Product findPoroductById(@PathVariable int id){
        return service.getProductbyId(id);
    }
    @GetMapping("/product/{name}")
    public Product findPoroductByName(@PathVariable String name){
        return service.getproductbyname(name);
    }
    @PutMapping("/update")
    public Product updateproduct(@RequestBody Product product){
        return service.updateproduct(product);
    }
    @DeleteMapping("/delete")
    public String deleteproduct(@PathVariable int id){
        return service.deleteproduct(id);
    }






}
