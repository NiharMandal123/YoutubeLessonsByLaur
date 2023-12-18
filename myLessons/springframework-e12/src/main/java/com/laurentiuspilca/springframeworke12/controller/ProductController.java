package com.laurentiuspilca.springframeworke12.controller;

import com.laurentiuspilca.springframeworke12.entities.Product;
import com.laurentiuspilca.springframeworke12.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
//    public List<Product> getAllSortedDescendingById(){
//     return productRepository.findAll(Sort.by("id").descending());
//    }

}
