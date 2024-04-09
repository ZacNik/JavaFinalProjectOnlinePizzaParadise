package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.Ingredients;
import java.io.Serializable;

public interface IngredientsRepository extends CrudRepository<Ingredients, Integer>, Serializable {
	
}
