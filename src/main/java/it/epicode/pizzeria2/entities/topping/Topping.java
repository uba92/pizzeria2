package it.epicode.pizzeria2.entities.topping;

import it.epicode.pizzeria2.entities.food.Food;
import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Topping extends Food  {

    @Override
    public String toString() {
        return "Topping: " + getName() + ", Prezzo: " + getPrice();
    }

}
