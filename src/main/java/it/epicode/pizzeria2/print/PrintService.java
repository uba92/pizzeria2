package it.epicode.pizzeria2.print;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class PrintService {
    @Value("${ideatore.nome}")
    private String ideatore;

    public void print(Printable printable) {
        log.info(printable.print());
    }

    //il metodo seguente ha lo stesso nome del precedente, questo è possibile perchè stiamo facendo un overload
    //quindi un metodo può essere scritto più volte ma con parametri differenti
    //per overload, a differenza dell'override, non devo annotare nulla
    public void print(List<Printable> printables) {
        for (Printable printable: printables) {
            log.info(printable.print());
        }
        log.info(ideatore);
    }
}
