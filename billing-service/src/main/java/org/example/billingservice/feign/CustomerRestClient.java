package org.example.billingservice.feign;

import org.example.billingservice.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service")
public interface CustomerRestClient {

    @GetMapping("/api/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);

}

/*
cette interface est un client Feign qui permet de communiquer avec le service customer-service,
en utilisant l'annotation @FeignClient avec le nom du service, puis elle définit une méthode
qui utilise l'annotation @GetMapping pour faire une requête GET vers l'URL spécifiée.
 */