package com.amadrid.mlp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id
    @GeneratedValue
    private BigInteger id;
    private String name;
    private String variety;
    private String description;

    @OneToMany(targetEntity = ProductCategory.class)
    private List categoryList;
}
