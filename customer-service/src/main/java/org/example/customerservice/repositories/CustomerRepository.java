package org.example.customerservice.repositories;

import org.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


/*
@RepositoryRestResource : fournit par Spring Data REST, permet de demander automatiquement a Spring de démarer
un web service RESTFull qui permet d'accéder a tout les méthodes qui se trouve dans l'interface JpaRepository
 */