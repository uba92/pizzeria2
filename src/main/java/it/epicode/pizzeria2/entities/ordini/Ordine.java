package it.epicode.pizzeria2.entities.ordini;

import it.epicode.pizzeria2.entities.menu.VoceMenu;
import it.epicode.pizzeria2.entities.tavolo.Tavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Ordine {
    private int numeroOrdine;
    private int numeroCoperti;
    private Tavolo tavolo;
    private StatoOrdine stato;
    private LocalDateTime oraOrdine = LocalDateTime.now();
    private List<VoceMenu> elementiOrdine = new ArrayList<>();
    @Value("${prezzo.coperto}")
    private double costoCoperto;

    public double calcTotOrdine() {
        double totCoperto = costoCoperto * numeroCoperti;
        double totElementi = elementiOrdine.stream().mapToDouble(VoceMenu::getPrice).sum();
        return totElementi + totCoperto;
    }

    public void printOrder() {
        System.out.println("Numero ordine: " + numeroOrdine);
        System.out.println("Numero coperti: " + numeroCoperti);
        System.out.println("Tavolo: " + tavolo);
        System.out.println("Stato ordine: " + stato);
        System.out.println("Ora ordine: " + oraOrdine);
        System.out.println("Ordine:");
        for (VoceMenu voceMenu : elementiOrdine) {
            System.out.println(voceMenu);
        }
        System.out.println("Costo coperto: " + costoCoperto);
        System.out.println("Prezzo totale: " + calcTotOrdine());
    }
}
