package com.amadrid.mlp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductPrice {

    @Id
    private Date date;
    @Id
    private BigInteger idProduct;
    private float costPrice;
    private float sellPrice;

}
