package com.example.ecommerce.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name="Product")
@Data
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ProdId")
    int prodId;
    @Column(name="Product Name")
     String name;

    @Column(name="Description")
     String description;

    @Column(name="Price")
    float price;

    @OneToMany
    imgDB images;
}
