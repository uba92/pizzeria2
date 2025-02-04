package it.epicode.pizzeria2.entities.pizza;

import it.epicode.pizzeria2.entities.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class PizzaConfig {


    private final Topping topping;
    private final Topping topping2;
    @Bean
    public Pizza pizza() {
        Pizza p = new Pizza();
        p.setName("Margherita");
        p.setDescription("250");
        p.setPrice(9.99);
        p.getToppings().add(topping);
        return p;
    }

    @Bean
    public Pizza pizza2() {
        Pizza p = new Pizza();
        p.setName("Diavola");
        p.setDescription("300");
        p.setPrice(11.99);
        p.getToppings().add(topping2);
        return p;

    }

    @Bean
    public Pizza pizza3() {
        Pizza p = new Pizza();
        p.setName("Prosciutto");
        p.setDescription("350");
        p.setPrice(12.99);
        p.getToppings().add(topping);
        return p;
    }
}
