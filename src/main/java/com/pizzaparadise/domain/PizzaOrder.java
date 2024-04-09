package com.pizzaparadise.domain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "pizzaorder")
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PizzaOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderID")
    private int orderID;

    @Column(name = "OrderDate")
    private LocalDateTime orderDate;

    @Column(name = "OrderTotal")
    private BigDecimal orderTotal;

    @Column(name = "PaymentStatus")
    private String paymentStatus;
    
    @Column(name = "DeliveryAddress")
    private String deliveryAddress;

//    @ManyToOne
//    @JoinColumn(name = "employee_id")
//    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "PizzaID")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "CustomerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "DeliveryID")
    private Delivery delivery;

	public void setPizzaId(Long pizzaId) {
		
		
	}

	public void setQuantity(int quantity) {
		
	}

	public void setPrice(BigDecimal price) {
		
		
	}
}