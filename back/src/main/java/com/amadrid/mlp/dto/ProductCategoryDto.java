package com.amadrid.mlp.dto;

import com.amadrid.mlp.model.Category;
import com.amadrid.mlp.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class ProductCategoryDto {
    Product product;
    List<Category> categories;
}
