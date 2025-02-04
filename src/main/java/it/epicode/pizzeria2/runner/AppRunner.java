package it.epicode.pizzeria2.runner;

import it.epicode.pizzeria2.entities.drinks.Drink;
import it.epicode.pizzeria2.entities.menu.Menu;
import it.epicode.pizzeria2.entities.ordini.Ordine;
import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.entities.pizzaiolo.Pizzaiolo;
import it.epicode.pizzeria2.entities.topping.Topping;
import it.epicode.pizzeria2.print.PrintService;
import it.epicode.pizzeria2.print.Printable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
@Order(1)

//questo runner usa la dependecy injection tramite autowired
public class AppRunner implements CommandLineRunner {

    private final Pizza pizza;
    private final PrintService printService;

    @Override
    public void run(String... args) throws Exception {
        printService.print(pizza);
    }
}
