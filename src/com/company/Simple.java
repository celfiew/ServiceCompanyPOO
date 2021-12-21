package com.company;

public class Simple extends Services{
    private double price;

    public Simple(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.getName() + "" + price;
    }
}
