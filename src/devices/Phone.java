package devices;

import creatures.Human;

public class Phone extends Devices {
    private String producer;
    private String model;
    private Double displaySize;
    private Integer batteryCapacity;
    private Integer internalStorage;
    private String os;

    public Phone(Integer id, String producer, String model, Double displaySize, Integer batteryCapacity, Integer internalStorage, String os) {
        super(id);
        this.producer = producer;
        this.model = model;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.internalStorage = internalStorage;
        this.os = os;
    }
    //toString() method

    public String toString() {
        return producer + ", " + model + ", " + os + ", " + displaySize + ", " + batteryCapacity + ", " + internalStorage;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("sorry, nie masz kasy");
        } else if (seller.phone != this) {
            System.out.println("błąd");

        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println("transakcja udana, telefon sprzedany");
        }
    }

    @Override
    void turnOn() {

    }
}