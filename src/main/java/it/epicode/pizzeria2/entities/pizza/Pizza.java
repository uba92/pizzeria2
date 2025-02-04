package it.epicode.pizzeria2.entities.pizza;

import it.epicode.pizzeria2.entities.menu.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizza implements VoceMenu {

    private String name;
    private String description;
    private double price;
}
