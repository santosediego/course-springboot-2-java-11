package com.santosediego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
