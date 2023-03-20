package devices;

import creatures.Human;

import java.sql.SQLOutput;

public class LPG extends Car {
    public Double maxTankPressure;


    public LPG(String model, String producer, Integer year, Integer numOfDoors, String color, Double value, Double maxTankPressure) {
        super(model, producer, year, numOfDoors, color, value);
        this.maxTankPressure = maxTankPressure;
        System.out.println("Utworzono samochód z instalacją gazową");
    }

    @Override
    void refuel() {
        
    }

    @Override
    void turnOn() {
        System.out.println("Odkręć gaz");
        System.out.println("Przekręć kluczyk");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("Działa, szerokiej drogi");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
