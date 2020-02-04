package com.amadrid.mlp.dto;

import com.amadrid.mlp.model.Category;
import com.amadrid.mlp.model.Product;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.List;

@Data
@Component
public class ProductCategoryDto {
    private BigInteger id;
    private String name;
    private String variety;
    private String description;
    List<Category> categories;
}
