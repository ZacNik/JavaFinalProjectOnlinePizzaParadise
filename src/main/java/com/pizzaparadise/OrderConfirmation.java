package com.pizzaparadise;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderConfirmation {
    private Long pizzaId;
    public Long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	private int quantity;
    private BigDecimal price;
    private LocalDateTime orderDate;

    // Getters and setters
    // ...
}
