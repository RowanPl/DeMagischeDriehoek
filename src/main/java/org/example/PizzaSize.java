package org.example;

public enum PizzaSize {

    SMALL(20, 5),
    MEDIUM(25, 7.50),
    LARGE(30, 10);

    private int diameter;
    private double price;

    PizzaSize(int diameter, double price) {
        this.diameter = diameter;
        this.price = price;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
}
