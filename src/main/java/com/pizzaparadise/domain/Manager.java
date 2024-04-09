package com.pizzaparadise.domain;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "manager")
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Manager implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ManagerID")
    private int managerID;

    @Column(name = "ContactPhone")
    private String contactPhone;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;
}