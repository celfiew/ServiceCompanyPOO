package com.company;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        try {
            company.addService(FactoryService.getclass("Colocación"));
            company.addService(FactoryService.getclass("Venta de aire"));
            company.addService(FactoryService.getclass("Combo"));
            company.showServices();
        } catch (Exception e){
            System.err.println("Este servicio no existe por favor ingrese uno valido");
        }

    }


}
