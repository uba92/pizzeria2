package it.epicode.pizzeria2.entities.food;

import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food implements Printable {
    private String name;
    private String description;
    private double price;

    @Override
    public String print() {
        return "Nome: " + name + " Descrizione: " + description + " Prezzo: " + price;
    }
}
