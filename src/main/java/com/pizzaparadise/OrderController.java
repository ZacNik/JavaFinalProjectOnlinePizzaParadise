package com.pizzaparadise;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pizzaparadise.db.PizzaOrderRepository;
import com.pizzaparadise.db.PizzaRepository;
import com.pizzaparadise.domain.Pizza;
import com.pizzaparadise.domain.PizzaOrder;

@Controller
@RequestMapping("/order")
public class OrderController {
	private PizzaOrderRepository pizzaOrderRepository;
	private PizzaRepository pizzaRepository;
	
	@Autowired
    public OrderController(PizzaOrderRepository pizzaOrderRepository, PizzaRepository pizzaRepository) {
        this.pizzaOrderRepository = pizzaOrderRepository;
        this.pizzaRepository = pizzaRepository;
    }
	
	@RequestMapping(value="/create", method=GET)
    public String orderPage(Model model) {
        //model.addAttribute("order", new PizzaOrder());
		model.addAttribute("pizzaOrderForm", new OrderPizzaForm());
        List<Pizza> pizzas = pizzaRepository.findAll();
        model.addAttribute("pizzas", pizzas);
        return "order/orders";
        
    }
    

	@RequestMapping(value = "/submitOrder", method = POST)
	public String submitOrder(@ModelAttribute OrderPizzaForm pizzaOrderForm) {
	    Optional<Pizza> optionalPizza = pizzaRepository.findById(pizzaOrderForm.getPizzaId());

	    if (optionalPizza.isPresent()) {
	        Pizza selectedPizza = optionalPizza.get();
	        PizzaOrder pizzaOrder = new PizzaOrder();
	        pizzaOrder.setPizzaId(pizzaOrderForm.getPizzaId());
	        pizzaOrder.setQuantity(pizzaOrderForm.getQuantity());
	        pizzaOrder.setPrice(selectedPizza.getPrice());
	        pizzaOrder.setOrderDate(LocalDateTime.now());
	        pizzaOrderRepository.save(pizzaOrder);
	        BigDecimal totalPrice = selectedPizza.getPrice().multiply(BigDecimal.valueOf(pizzaOrderForm.getQuantity()));

	        // Create an orderConfirmation object to pass data to the confirmation page
	        OrderConfirmation orderConfirmation = new OrderConfirmation();
	        orderConfirmation.setPizzaId(pizzaOrderForm.getPizzaId());
	        orderConfirmation.setQuantity(pizzaOrderForm.getQuantity());
	        orderConfirmation.setPrice(totalPrice);
	        orderConfirmation.setOrderDate(LocalDateTime.now());

	        // Pass orderConfirmation object to the confirmation page
	        pizzaOrderForm.addAttribute("orderConfirmation", orderConfirmation);
	        pizzaOrderRepository.save(pizzaOrder);
	        return "redirect:/orderConfirmation";
	    } else {
	        return "redirect:/order/create";
	    }
	}
	
	
}