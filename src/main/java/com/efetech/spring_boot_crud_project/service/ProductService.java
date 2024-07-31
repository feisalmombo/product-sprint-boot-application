package com.efetech.spring_boot_crud_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efetech.spring_boot_crud_project.entity.Product;
import com.efetech.spring_boot_crud_project.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired // This part used to inject from repository
    private ProductRepository repository;

    // Save Single Product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // Save List of Products
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    // Get All Products
    public List<Product> getProducts() {
        return repository.findAll();
    }

    // Get Single Product By ID
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Get Single Product By Name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    // Delete Single Product with reference of ID
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(product);
    }
}
