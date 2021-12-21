package com.company;

public class FactoryService {

    public static Services getclass(String serviceName) {
        Services result = null;
        switch (serviceName) {
            case "Colocación":
                result = new Simple("Colocación","Descripción",10000 * (1 + 0.10));
                return result;
            case "Venta de aire":
                result = new Simple("Venta de aire","Descripción",65000);
                return result;
            case "Combo":
                result = new Combo("Combo","Descripción",0.10);
                ((Combo) result).addService(FactoryService.getclass("Colocación"));
                ((Combo) result).addService(FactoryService.getclass("Venta de aire"));
                return result;
            default:
                return null;
        }
    }
}


//Servicio simple: “Venta de aire
//acondicionado” que tiene un precio de 65.000 pesosServicio simple:
//“Colocación” que tiene un precio base de 10.000 pesos y final de
//11.000 por ser un servicio de “Colocación”.Combo de servicios:
//contiene los dos servicios simples anteriores, este combo tiene
//un descuento del 10%, es decir, un precio de 68.400 pesos
