package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<PizzaTopping> toppings = new ArrayList<>();

        System.out.println("Welkom bij de Magische Driehoek!, (Rowans Pizzaria)");
        scanner.nextLine();
        System.out.println("Je hebt keuze uit de volgende toppings:");

        for (PizzaTopping topping : PizzaTopping.values()) {
            System.out.println(topping.name().toLowerCase());
        }

        System.out.println("Voer de toppings in die je wilt toevoegen aan je pizza. Type 'done' als je klaar bent");
        while (true) {
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("DONE")) {
                break;
            }
            try {
                PizzaTopping topping = PizzaTopping.valueOf(input);
                toppings.add(topping);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid topping. Please try again.");
            }
        }

        System.out.println("Kies de grootte van je pizza:");
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size.name().toLowerCase() + " (" + size.getDiameter() + " inch)");
        }

        PizzaSize size = null;
        while (size == null) {
            String input = scanner.nextLine().toUpperCase();
            try {
                size = PizzaSize.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid size. Please try again.");
            }


        }

        System.out.println("Wil je de pizza laten bezorgen? (ja/nee)");
        boolean isDelivery = scanner.nextLine().equalsIgnoreCase("ja");

        String address = null;
        if (isDelivery) {
            System.out.println("Voer je adres in:");
            address = scanner.nextLine();
        }

        PizzaOrder order = new PizzaOrder(toppings.toArray(new PizzaTopping[0]), size.getPrice(), isDelivery, address);

        System.out.println("Je bestelling:");
        System.out.println("Toppings:");
        for (PizzaTopping topping : order.getToppings()) {
            System.out.println(topping.name().toLowerCase());
        }
        System.out.println("Grootte: " + size.name().toLowerCase());
        System.out.println("Bezorging: " + (order.isDelivery() ? "Ja" : "Nee"));
        if (order.isDelivery()) {
            if (order.getAddress().contains("Novi")){
                System.out.println("Je pizza is gratis want Daniel trekt de pinpas");
            }
            else {
                System.out.println("Address: " + order.getAddress());
                System.out.println("Totale prijs: €" + order.calculatePrice());
            }
        }
        else {
            System.out.println("Totale prijs: €" + order.calculatePrice());
        }
    }
}