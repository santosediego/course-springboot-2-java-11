package com.santosediego.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
