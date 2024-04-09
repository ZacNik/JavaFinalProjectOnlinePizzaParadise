package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.Pizza;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface PizzaRepository extends CrudRepository<Pizza, Integer>, Serializable {
    List<Pizza> findAll();
    Optional <Pizza> findById(Long pizzaID);
}
