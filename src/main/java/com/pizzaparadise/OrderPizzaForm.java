package com.pizzaparadise;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.pizzaparadise.domain.Pizza;

public class OrderPizzaForm {

	private Pizza selectedPizza;
	
	
	public Pizza getSelectedPizza() {
		return selectedPizza;
	}

	public void setSelectedPizza(Pizza selectedPizza) {
		this.selectedPizza = selectedPizza;
	}

	@NotNull
	private Long pizzaId;

	
	public Long getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(Long pizzaId) {
		this.pizzaId = pizzaId;
	}

	@NotNull
	private int quantity;


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	private BigDecimal price;


	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	private Date orderDate;


	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void addAttribute(String string, OrderConfirmation orderConfirmation) {
		// TODO Auto-generated method stub
		
	}
}

