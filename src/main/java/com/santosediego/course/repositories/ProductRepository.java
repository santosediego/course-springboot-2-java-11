package com.santosediego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
