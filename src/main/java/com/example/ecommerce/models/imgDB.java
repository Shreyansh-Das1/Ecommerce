package com.example.ecommerce.models;

import jakarta.persistence.*;

@Entity(name = "Prod Img")
public class imgDB extends product{ //BCNF Form
    public imgDB(){}
    @Column(name = "Product ID")    //Foreign Key
    int id = getProdId();
    @Column(name = "Image")
    byte[] image ;

    @ManyToOne @JoinColumn(name="ProdId")
    product prod;
}
