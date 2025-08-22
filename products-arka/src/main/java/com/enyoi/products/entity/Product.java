package com.enyoi.products.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
@Getter
@Setter
public class Product {

    @Id
    @Column("productId")
    private Integer id;

    private String name;

    private String description;
}
