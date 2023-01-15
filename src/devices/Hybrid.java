package devices;

public class Hybrid extends Car implements Comparable<Petrol> {
    public Hybrid(String model, String producer, Integer year, Integer numOfDoors, String color, Double value) {
        super(model, producer, year, numOfDoors, color, value);
    }

    @Override
    void refuel() {

    }

    @Override
    public int compareTo(Petrol o) {
        return 0;
    }
}
