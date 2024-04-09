package com.pizzaparadise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/aboutus")
    public String aboutPage() {
        return "aboutus";
    }
}