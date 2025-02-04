package it.epicode.pizzeria2.entities.topping;

import it.epicode.pizzeria2.entities.menu.VoceMenu;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping implements VoceMenu {

    private String name;
    private String description;
    private double price;

    @Override
    public String toString() {
        return getName();
    }

}
