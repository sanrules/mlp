package com.amadrid.mlp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductCategory {

    @Id
    private BigInteger idProduct;
    @Id
    private BigInteger idCategory;

}
