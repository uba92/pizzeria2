package it.epicode.pizzeria2.runner;

import it.epicode.pizzeria2.entities.menu.Menu;
import it.epicode.pizzeria2.entities.ordini.Ordine;
import it.epicode.pizzeria2.entities.ordini.StatoOrdine;
import it.epicode.pizzeria2.entities.tavolo.Tavolo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;


@Component
//questo runner usa la dependecy injection tramite autowired
public class AppRunner implements CommandLineRunner {

    @Autowired
    private Menu menuDiOggi;
    @Override
    public void run(String... args) {

        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);
        //crea un menu con 3 drinks, 2 pizza e 1 topping
        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1);
        ordine.setNumeroCoperti(2);
        ordine.setTavolo(tavolo);
        ordine.setStato(StatoOrdine.IN_CORSO);
        ordine.setOraOrdine(LocalDateTime.now());
        ordine.setElementiOrdine(List.of(
                menuDiOggi.getVoceMenu().get(0),
                menuDiOggi.getVoceMenu().get(1),
                menuDiOggi.getVoceMenu().get(2),
                menuDiOggi.getVoceMenu().get(3),
                menuDiOggi.getVoceMenu().get(4),
                menuDiOggi.getVoceMenu().get(5),
                menuDiOggi.getVoceMenu().get(6)
                ));

    }
}
