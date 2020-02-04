package com.amadrid.mlp.controller;

import com.amadrid.mlp.dto.ProductCategoryDto;
import com.amadrid.mlp.repository.CategoryRepository;
import com.amadrid.mlp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductCategoryDto productCategoryDto;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/{idProduct}")
    public ProductCategoryDto getProduct(@PathVariable("idProduct") String id) {

        productCategoryDto.setProduct(productRepository.findProductById(new BigInteger(id)));
        productCategoryDto.setCategories(categoryRepository.findCategories(id));

        return productCategoryDto;
    }
}
