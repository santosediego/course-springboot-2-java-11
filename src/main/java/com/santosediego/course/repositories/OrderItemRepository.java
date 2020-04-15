package com.santosediego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
