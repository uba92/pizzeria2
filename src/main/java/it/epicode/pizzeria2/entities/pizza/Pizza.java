package it.epicode.pizzeria2.entities.pizza;

import it.epicode.pizzeria2.entities.food.Food;
import it.epicode.pizzeria2.entities.topping.Topping;
import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza extends Food  {
    @Autowired
    private Pizza pizza;
    private List<Topping> toppings = new ArrayList<>();
}
