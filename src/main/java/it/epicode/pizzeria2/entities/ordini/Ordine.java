package it.epicode.pizzeria2.entities.ordini;

import it.epicode.pizzeria2.entities.drinks.Drink;
import it.epicode.pizzeria2.entities.menu.Menu;
import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.entities.topping.Topping;
import it.epicode.pizzeria2.print.Printable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ordine implements Printable {
    private int numeroOrdine;
    private List<Menu> ordine = new ArrayList<>();
    private String stato;
    private int numeroCoperti;
    private LocalDateTime oraOrdine;
    private double prezzoTotale;

    @Override
    public String print() {
        return "Ordine numero: " + numeroOrdine + " Stato: " + stato + " Numero Coperti: " + numeroCoperti + " Ora: " +oraOrdine + " Tot: " + prezzoTotale;
    }
}
