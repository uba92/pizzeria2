package it.epicode.pizzeria2.entities.drinks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean
    public Drink drink() {
        Drink d = new Drink();
        d.setName("Coca Cola");
        d.setDescription("139 calorie");
        d.setPrice(2.99);
        d.setQuantity("33 cl");
        return d;
    }

    @Bean
    public Drink drink2() {
        Drink d = new Drink();
        d.setName("Fanta");
        d.setDescription("139 calorie");
        d.setPrice(2.99);
        d.setQuantity("33 cl");
        return d;
    }

    @Bean
    public Drink drink3() {
        Drink d = new Drink();
        d.setName("Sprite");
        d.setDescription("139 calorie");
        d.setPrice(2.99);
        d.setQuantity("33 cl");
        return d;
    }

    @Bean
    public Drink drink4() {
        Drink d = new Drink();
        d.setName("Pepsi");
        d.setDescription("139 calorie");
        d.setPrice(2.99);
        d.setQuantity("33 cl");
        return d;
    }

}
