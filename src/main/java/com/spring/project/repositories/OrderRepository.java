package com.spring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
