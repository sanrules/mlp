package com.amadrid.mlp.controller;

import com.amadrid.mlp.dto.ProductCategoryDto;
import com.amadrid.mlp.model.Product;
import com.amadrid.mlp.model.ProductCategory;
import com.amadrid.mlp.repository.CategoryRepository;
import com.amadrid.mlp.repository.ProductRepository;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ProductController {

    @Autowired
    ProductCategoryDto productCategoryDto;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/{idProduct}")
    public ProductCategoryDto getProduct(
            @PathVariable("idProduct")
                    String id) {

        return mapperToDto(productRepository.findProductById(new BigInteger(id)));
    }

    @GetMapping("/all")
    public List<ProductCategoryDto> getAll() {

        List<ProductCategoryDto> productList = new ArrayList<>();
        List<Product> products = productRepository.findAll();

        for (Product product : products) {
            productList.add(mapperToDto(product));
        }

        return productList;
    }

    private ProductCategoryDto mapperToDto(Product product) {

        productCategoryDto = new ProductCategoryDto();
        productCategoryDto.setId(product.getId());
        productCategoryDto.setName(product.getName());
        productCategoryDto.setDescription(product.getDescription());
        productCategoryDto.setVariety(product.getVariety());

        productCategoryDto.setCategories(categoryRepository.findCategories(product.getId().toString()));

        return productCategoryDto;
    }
}
