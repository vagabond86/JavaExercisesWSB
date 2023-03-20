package devices;

import creatures.Human;
import creatures.Salleable;

import java.util.LinkedList;
import java.util.List;

public abstract class Car implements Salleable {
    private String model;
    private String producer;
    private Integer year;
    private Integer numOfDoors;
    private String color;
    private Double millage;
    private Double value;
    private List<Human> owners = new LinkedList<>();
    private Human currentOwner;

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

    public void setOwners(List<Human> owners) {
        this.owners = owners;
        this.currentOwner = owners.get(owners.size() - 1);
    }

    public Human getCurrentOwner() {
        return currentOwner;
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

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Sprzedawca nie posiada tego samochodu w garażu.");
        }

        if (buyer.hasFreeParkingSpace()) {
            throw new Exception("Kupujący nie ma wolnych miejsc w garażu.");
        }

        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma wystarczającej ilości gotówki.");
        }

        if (this.getLastOwner() != seller) {
            throw new Exception("Auto zostało wcześniej sprzedane");

        }

        seller.removeCar(this);
        buyer.addCar(this);
        seller.cash += price;
        buyer.cash -= price;

        // update owner list and current owner
        this.owners.add(buyer);
        currentOwner = buyer;

        System.out.println("Transakcja zakończona sukcesem.");
    }

    public Human getLastOwner() {
        return this.owners.get(this.owners.size() - 1);
    }

    public boolean wasHumanAnOwner(Human human) {
        return this.owners.contains(human);
    }

    public boolean didASoldToB(Human seller, Human buyer) {
        for (int i = 0; i < owners.size() - 1; i++){
            if (owners.get(i).equals(seller) && owners.get(i+1).equals(buyer)){
                return true;
            }
        }
        return false;


    }
    public void addFirstOwner(Human firstOwner){
        if(this.owners.isEmpty()){
            this.owners.add(firstOwner);
        }
    }
}
