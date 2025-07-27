package org.example.customerservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter @Builder
public class Customer {

    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
