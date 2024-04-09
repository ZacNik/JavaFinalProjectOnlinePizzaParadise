package com.pizzaparadise.domain;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "deliverydriver")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class DeliveryDriver implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DriverID")
    private int driverID;

    @Column(name = "Name")
    private String name;

    @Column(name = "ContactPhone")
    private String contactPhone;

    @Column(name = "VehicleInfo")
    private String vehicleInfo;

    @OneToMany(mappedBy = "driver")
    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "driver")
    private List<Employee> employees;
}
