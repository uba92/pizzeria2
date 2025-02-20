package it.epicode.pizzeria2.entities.drinks;

import it.epicode.pizzeria2.entities.menu.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink implements VoceMenu {
    private String name;
    private String description;
    private double price;
    private String quantity;
}
