package it.epicode.pizzeria2.entities.tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tavolo {

    private int numeroTavolo;
    private int maxCoperti;
    private String stato;
}
