package com.pizzaparadise.db;
import org.springframework.data.repository.CrudRepository;
import com.pizzaparadise.domain.Employee;
import java.io.Serializable;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>, Serializable {
    
}
