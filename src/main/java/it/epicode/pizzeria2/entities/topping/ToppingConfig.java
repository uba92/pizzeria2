package it.epicode.pizzeria2.entities.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ToppingConfig {

    @Bean
    public Topping topping() {
        Topping t = new Topping();
        t.setName("Pomodoro");
        t.setDescription("50 calorie");
        t.setPrice(0.99);
        return t;
    }

    @Bean
    public Topping topping2() {
        Topping t = new Topping();
        t.setName("Mozzarella");
        t.setDescription("50 calorie");
        t.setPrice(1.49);
        return t;
    }

}
