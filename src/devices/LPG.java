package devices;

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
}
