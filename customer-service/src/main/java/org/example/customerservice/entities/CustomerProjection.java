package org.example.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = {Customer.class})
public interface CustomerProjection {

    String getName();
    String getEmail();
}

/*
cette interface permet de choisir quelles informations seront exposées par Spring Data REST, c-à-d ce que j'ai
besoin de renvoyer au client. comme les DTO, elle est aussi appelée projection.
 */
