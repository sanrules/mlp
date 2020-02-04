package com.amadrid.mlp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductPrice implements Serializable {

    @Id
    @Column(name = "date")
    private Date date;
    @Id
    private BigInteger idProduct;
    private float costPrice;
    private float sellPrice;

}
