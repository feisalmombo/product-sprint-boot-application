package com.efetech.spring_boot_crud_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efetech.spring_boot_crud_project.entity.Product;
import com.efetech.spring_boot_crud_project.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired // This part used to inject from repository
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }
}
