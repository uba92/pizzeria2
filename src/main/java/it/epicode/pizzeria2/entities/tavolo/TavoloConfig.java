package it.epicode.pizzeria2.entities.tavolo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TavoloConfig {

    @Bean
    public Tavolo tavolo1() {
        Tavolo t = new Tavolo();
        t.setNumeroTavolo(1);
        t.setMaxCoperti(4);
        t.setStato("Libero");
        return t;
    }

    @Bean
    public Tavolo tavolo2() {
        Tavolo t = new Tavolo();
        t.setNumeroTavolo(2);
        t.setMaxCoperti(8);
        t.setStato("Libero");
        return t;
    }

    @Bean
    public Tavolo tavolo3() {
        Tavolo t = new Tavolo();
        t.setNumeroTavolo(3);
        t.setMaxCoperti(6);
        t.setStato("Occupato");
        return t;
    }
}
