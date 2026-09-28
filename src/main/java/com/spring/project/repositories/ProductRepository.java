package com.spring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
