package it.epicode.pizzeria2.runner;


import it.epicode.pizzeria2.entities.pizza.Pizza;
import it.epicode.pizzeria2.print.PrintService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(2)

//questo runner usa la dependency injection tramite costruttore
public class MenuRunner implements CommandLineRunner {

    private PrintService printService;

    public MenuRunner(PrintService printService) {
        this.printService = printService;
    }

    @Override
    public void run(String... args) {
        log.info("---STAMPA PIZZA (DEPENDENCY INJECTIOIN TRAMITE COSTRUTTORE---");
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setPrice(9.99);
        pizza.setDescription("500 cal");
        printService.print(pizza);
    }

}
