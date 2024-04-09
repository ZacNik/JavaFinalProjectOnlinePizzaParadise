package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.DeliveryDriver;
import java.io.Serializable;

public interface DeliveryDriverRepository extends CrudRepository<DeliveryDriver, Integer>, Serializable {
	
}
