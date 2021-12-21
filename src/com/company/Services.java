package com.company;

public abstract class Services {
    private String name;
    private String description;

    public Services(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }



}

