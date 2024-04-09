package com.pizzaparadise.domain;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "employee")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private int employeeID;

    @ManyToOne
    @JoinColumn(name = "ManagerID")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "DriverID")
    private DeliveryDriver driver;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Position")
    private String position;

    @Column(name = "ContactPhone")
    private String contactPhone;

//    @OneToMany(mappedBy = "employee")
//    private List<PizzaOrder> orders;
}
