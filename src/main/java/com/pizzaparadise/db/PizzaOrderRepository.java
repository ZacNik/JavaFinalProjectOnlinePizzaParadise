package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.PizzaOrder;
import java.io.Serializable;

public interface PizzaOrderRepository extends CrudRepository<PizzaOrder, Integer>, Serializable {
    
}
