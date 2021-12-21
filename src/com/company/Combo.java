package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Services{

    private double discount;
    private List<Services> services;

    public Combo(String name, String description, double discount) {
        super(name, description);
        this.discount = discount;
        this.services = new ArrayList<>();
    }

    public void addService(Services service){
        services.add(service);
    }

    @Override
    public double calculatePrice() {
        double sumTotal = 0;
        for (Services service: services) {
            sumTotal += service.calculatePrice();
        }
        return sumTotal*(1-discount);
    }

    @Override
    public String toString() {
        return getName() + "" + calculatePrice();
    }

}
