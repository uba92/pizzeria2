package it.epicode.pizzeria2.entities.menu;

import it.epicode.pizzeria2.entities.drinks.Drink;
import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.entities.topping.Topping;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class MenuConfig {

    private final Drink drink;
    private final Drink drink2;
    private final Drink drink3;
    private final Pizza pizza;
    private final Pizza pizza2;
    private final Pizza pizza3;
    private final Topping topping;
    private final Topping topping2;

    @Bean
    public Menu creaMenu() {
         Menu m= new Menu();
         m.setName("Menu di oggi");
         m.setVoceMenu(List.of(drink, drink2, drink3, pizza, pizza2, pizza3, topping, topping2));

         return m;
    }
}
