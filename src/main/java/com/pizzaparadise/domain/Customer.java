package com.pizzaparadise.domain;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CustomerID")
    private int customerID;

    @Column(name = "Name")
    private String name;

    @Column(name = "ContactPhone")
    private String contactPhone;

    @Column(name = "LoyaltyPoints")
    private Integer loyaltyPoints;

    @OneToMany(mappedBy = "customer")
    private List<PizzaOrder> orders;
}
