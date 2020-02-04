package com.amadrid.mlp.repository;

import com.amadrid.mlp.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findProductById(BigInteger id);
}
