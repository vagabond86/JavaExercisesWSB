package devices;

import creatures.Human;
import creatures.Salleable;

public abstract class Car implements Salleable {
    private String model;
    private String producer;
    private Integer year;
    private Integer numOfDoors;
    private String color;
    private Double millage;
    private Double value;


    // konstruktory
    public Car(String model, String producer, Integer year, Integer numOfDoors, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.numOfDoors = numOfDoors;
        this.color = color;
        this.millage = 0.0;
        this.value = value;
    }

    // gettery i settery

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getValue() {
        return value;
    }

    public Double getMillage() {
        return millage;
    }

    public void setMillage(Double millage) {
        this.millage = millage;
    }

    // toString() method
    public String toString() {
        return producer + " " + model + ", color: " + color + ", value: " + value;
    }


    void turnOn() {
        System.out.println("przekręcam kluczyk");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("mieli");
        System.out.println("odpalił");

    }

    abstract void refuel();

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("sorry, nie masz kasy");
        } else if (seller.car != this) {
            System.out.println("błąd");

        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.car = this;
            seller.car = null;
            System.out.println("transakcja udana, telefon sprzedany");
        }
    }
}
