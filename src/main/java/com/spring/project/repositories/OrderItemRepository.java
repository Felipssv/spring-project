package com.spring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
