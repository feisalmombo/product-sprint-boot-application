package com.efetech.spring_boot_crud_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efetech.spring_boot_crud_project.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
