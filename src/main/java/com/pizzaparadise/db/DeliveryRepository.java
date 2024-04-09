package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.Delivery;
import java.io.Serializable;

public interface DeliveryRepository extends CrudRepository<Delivery, Integer>, Serializable {
    
}
