package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.PizzaIngredient;
import java.io.Serializable;

public interface PizzaIngredientRepository extends CrudRepository<PizzaIngredient, Integer>, Serializable {
    
}
