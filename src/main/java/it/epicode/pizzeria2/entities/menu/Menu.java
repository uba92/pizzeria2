package it.epicode.pizzeria2.entities.menu;

import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.entities.drinks.Drink;
import it.epicode.pizzeria2.entities.topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    private String name;
    private List<Pizza> pizzas = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
}
