package it.epicode.pizzeria2.entities.pizza;

import it.epicode.pizzeria2.entities.food.Food;
import it.epicode.pizzeria2.entities.topping.Topping;
import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza extends Food  {

    private List<Topping> toppings = new ArrayList<>();

    @Override
    public String print() {
        StringBuilder result = new StringBuilder(super.print());
        for (Topping topping : toppings) {
            result.append("\n").append(topping);
        }
        return result.toString();
    }

}
