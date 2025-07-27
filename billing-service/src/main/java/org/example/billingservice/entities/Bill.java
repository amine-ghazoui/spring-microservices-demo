package org.example.billingservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Bill {

    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private Long CustomerId;

    @OneToMany(mappedBy = "bill")   
    private List<ProductItem> productItems = new ArrayList<>();
}
