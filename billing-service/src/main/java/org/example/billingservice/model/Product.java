package org.example.billingservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {

    private String id;
    private String nom;
    private double price;
    private int quantity;
}
