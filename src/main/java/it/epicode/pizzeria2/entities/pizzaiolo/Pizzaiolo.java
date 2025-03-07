package it.epicode.pizzeria2.entities.pizzaiolo;

import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pizzaiolo implements Printable {
    private String name;
    private String surname;

    @Override
    public String print() {
        return "Pizzaiolo " + name + " " + surname;
    }
}
