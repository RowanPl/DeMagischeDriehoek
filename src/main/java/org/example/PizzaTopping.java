package org.example;

public enum PizzaTopping {

    KAAS(20, "gram", 0.20),
    SALAMI(30, "gram", 0.30),
    HAM(25, "gram", 0.25),
    ANANAS(15, "gram", 0.15),
    CHAMPIGNONS(10, "gram", 0.10),
    PEPERONI(35, "gram", 0.35),
    UI(5, "gram", 0.05),
    OLIJVEN(10, "gram", 0.10),
    PAPRIKA(10, "gram", 0.10),
    TOMAAT(10, "gram", 0.10),
    RAUWE_HAM(25, "gram", 0.25),
    RUCOLA(5, "gram", 0.05);


    private int weight;
    private String unit;
    private double price;

    PizzaTopping() {
        this.weight = 10;
        this.unit = "gram";
        this.price = 0.20;
    }

    PizzaTopping(int weight, String gram, double price) {
        this.weight = weight;
        this.unit = gram;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
