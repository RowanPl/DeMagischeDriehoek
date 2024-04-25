package org.example;

public class PizzaOrder {
    private PizzaTopping[] toppings;
    private double pizzaPrice;
    private boolean isDelivery;
    private String address;

    public PizzaOrder(PizzaTopping[] toppings, double price, boolean isDelivery, String address) {
        this.toppings = toppings;
        this.pizzaPrice =  price;
        this.isDelivery = isDelivery;
        this.address = address;
    }

    public PizzaTopping[] getToppings() {
        return toppings;
    }


    public boolean isDelivery() {
        return isDelivery;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double calculatePrice() {
        double price = 0;
        for (PizzaTopping topping : toppings) {
            price += topping.getPrice();
        }
        price += pizzaPrice;
        if (isDelivery) {
            price += 2.50;
        }
        return price;
    }
}
