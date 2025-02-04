package it.epicode.pizzeria2.entities.drinks;

import it.epicode.pizzeria2.entities.food.Food;
import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink extends Food  {
    private String quantity;
}
