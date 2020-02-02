package com.amadrid.mlp.repository;

import com.amadrid.mlp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findCategoryById(int id);
    
}
