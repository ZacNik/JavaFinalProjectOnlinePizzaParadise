package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;

import com.pizzaparadise.domain.Manager;

import java.io.Serializable;

public interface ManagerRepository extends CrudRepository<Manager, Integer>, Serializable {
    
}
