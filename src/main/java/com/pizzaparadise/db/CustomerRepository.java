package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;

import com.pizzaparadise.domain.Customer;

import java.io.Serializable;

public interface CustomerRepository extends CrudRepository<Customer, Integer>, Serializable {
    
}