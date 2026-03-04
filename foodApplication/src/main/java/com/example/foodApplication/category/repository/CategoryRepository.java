package com.example.foodApplication.category.repository;

import com.example.foodApplication.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
