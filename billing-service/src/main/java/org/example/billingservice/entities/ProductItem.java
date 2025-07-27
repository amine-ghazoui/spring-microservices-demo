package org.example.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class ProductItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;
}
