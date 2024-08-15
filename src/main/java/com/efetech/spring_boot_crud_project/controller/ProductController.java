package com.efetech.spring_boot_crud_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.efetech.spring_boot_crud_project.entity.Product;
import com.efetech.spring_boot_crud_project.service.ProductService;

@RestController
public class ProductController {

    // Inject from service
    @Autowired
    private ProductService service;

    // Route for add product
    @PostMapping("/api/v1/product/add/product")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // Route for add List of product
    @PostMapping("/api/v1/product/add/products")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/api/v1/all/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/api/v1/single/product/byId/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/api/v1/single/product/byName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/api/v1/product/update/product")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/api/v1/product/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
