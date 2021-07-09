package com.asset.management.puja.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asset.management.puja.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Optional<Category> findByCategoryIdAndCategoryName(Long categoryId, String categoryName);

}
