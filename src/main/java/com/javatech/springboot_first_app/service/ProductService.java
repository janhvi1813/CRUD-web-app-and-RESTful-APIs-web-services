package com.javatech.springboot_first_app.service;

import com.javatech.springboot_first_app.entity.Product;
import com.javatech.springboot_first_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
       return  repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }
    public Product getProductbyId(int id){
        return repository.findById(id).orElse(null);
    }
    public List<Product> getproducts(List<Product> products){
        return repository.findAll();
    }
    public Product getproductbyname(String name){
        return repository.findByName(name);
    }
    public String deleteproduct(int id){
        repository.deleteById(id);
        return "Product deleted!"+id;
    }
    public Product updateproduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);


    }









}
