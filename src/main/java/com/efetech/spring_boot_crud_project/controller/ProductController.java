package com.efetech.spring_boot_crud_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efetech.spring_boot_crud_project.entity.Product;
import com.efetech.spring_boot_crud_project.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

}
