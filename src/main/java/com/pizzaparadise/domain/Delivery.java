package com.pizzaparadise.domain;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "delivery")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Delivery implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DeliveryID")
    private int deliveryID;

    @Column(name = "DeliveryDate")
    private Date deliveryDate;

    @Column(name = "DeliveryStatus")
    private String deliveryStatus;

    @Column(name = "DeliveryAddress")
    private String deliveryAddress;

    @ManyToOne
    @JoinColumn(name = "DriverID")
    private DeliveryDriver driver;

    @OneToMany(mappedBy = "delivery")
    private List<PizzaOrder> orders;
}
