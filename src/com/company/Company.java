package com.company;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Services> services;

    public Company() {
        this.services = new ArrayList<>();
    }

    public void addService(Services service){
        services.add(service);
    }


    public void showServices(){
        for (Services service: services) {
            System.out.println( service.getName() + " " + service.calculatePrice());
        }
    }


}
