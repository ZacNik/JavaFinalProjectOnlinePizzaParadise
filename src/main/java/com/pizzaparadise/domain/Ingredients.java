package com.pizzaparadise.domain;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "ingredients")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Ingredients implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IngredientID")
    private int ingredientID;

    @Column(name = "Name")
    private String name;

    @Column(name = "PricePerUnit")
    private BigDecimal pricePerUnit;

    @Column(name = "QTY")
    private Integer qty;

    @OneToMany(mappedBy = "ingredient")
    private List<PizzaIngredient> pizzaIngredients;
}
 