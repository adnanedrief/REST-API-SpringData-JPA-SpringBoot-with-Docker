package com.example.jpa.controller;

import com.example.jpa.entity.ProductEntity;
import com.example.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @RequestMapping(value="/products",method= RequestMethod.GET)
    public List<ProductEntity> getProducts(){
        return productRepository.findAll();
    }

    @RequestMapping(value="/product/{id}",method=RequestMethod.GET)
    public ProductEntity getProductById(@PathVariable("id") int id) {
        return productRepository.findById(id).get();
    }

    @RequestMapping(value="/product/add",method=RequestMethod.POST)
    public ProductEntity createProduct(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }
    @RequestMapping(value="/product/delete/{id}",method=RequestMethod.DELETE)
    public void  deleteProduct(@PathVariable("id") int id) {
        productRepository.deleteById(id);
    }
}
