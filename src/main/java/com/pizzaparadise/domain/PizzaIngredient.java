package com.pizzaparadise.domain;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "pizzaingredient")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class PizzaIngredient implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PizzaIngredientID")
    private int pizzaIngredientID;

    @ManyToOne
    @JoinColumn(name = "PizzaID")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "IngredientID")
    private Ingredients ingredient;
}
