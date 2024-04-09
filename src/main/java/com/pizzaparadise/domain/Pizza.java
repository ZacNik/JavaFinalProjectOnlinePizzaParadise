package com.pizzaparadise.domain;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "pizza")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Pizza implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PizzaID")
    private Long pizzaID;
    
    @Column(name = "Name")
    private String name;

    @Column(name = "Size")
    private String size;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;
    
    @OneToMany(mappedBy = "pizza")
    private List<PizzaIngredient> pizzaIngredients;

    @OneToMany(mappedBy = "pizza")
    private List<PizzaOrder> orders;
    
    public String getDisplay() {
    	return name + " " + size;
    }
}
