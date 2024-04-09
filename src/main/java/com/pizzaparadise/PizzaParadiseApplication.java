package com.pizzaparadise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = {"com.pizzaparadise.domain", "com.pizzaparadise.db"})
@ComponentScan(basePackages = "com.pizzaparadise")
public class PizzaParadiseApplication {

    public static void main(String[] args) {
        SpringApplication.run(PizzaParadiseApplication.class, args);
    }

}