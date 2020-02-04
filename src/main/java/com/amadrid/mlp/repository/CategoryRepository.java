package com.amadrid.mlp.repository;

import com.amadrid.mlp.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.List;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Category findCategoryById(BigInteger id);

    @Query(value = "SELECT * FROM category WHERE id IN (SELECT idCategory FROM product_category WHERE idCategory = :id)", nativeQuery = true)
    List<Category> findCategories(@Param("id") String id);


}
