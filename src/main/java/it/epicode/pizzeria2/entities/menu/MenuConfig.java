package it.epicode.pizzeria2.entities.menu;

import it.epicode.pizzeria2.entities.drinks.Drink;
import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.entities.topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {
    @Autowired
    private Drink drink;
    @Autowired
    private Drink drink2;
    @Autowired
    private Drink drink3;
    @Autowired
    private Pizza pizza;
    @Autowired
    private Pizza pizza2;
    @Autowired
    private Pizza pizza3;
    @Autowired
    private Topping topping;
    @Autowired
    private Topping topping2;

    @Bean
    public Menu creaMenu() {
         Menu m= new Menu();
         m.setName("Menu di oggi");
         m.getDrinks().add(drink);
         m.getDrinks().add(drink2);
         m.getDrinks().add(drink3);
         //oppure
//        m.setDrinks(List.of(drink1,drink2));
        m.getPizzas().add(pizza);
        m.getPizzas().add(pizza2);
        m.getPizzas().add(pizza3);


        pizza.getToppings().add(topping);
        pizza.getToppings().add(topping2);

        pizza2.getToppings().add(topping);
        pizza2.getToppings().add(topping2);

        pizza3.getToppings().add(topping);
        pizza3.getToppings().add(topping2);
         return m;
    }
}
