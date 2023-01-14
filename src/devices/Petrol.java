package devices;

public class Petrol extends Car {
    public Double tankCapacity;


    public Petrol(String model, String producer, Integer year, Integer numOfDoors, String color, Double value, Double tankCapacity) {
        super(model, producer, year, numOfDoors, color, value);
        this.tankCapacity = tankCapacity;
        System.out.println("Utworzono samochód z silnikiem diesla");
    }

    @Override
    void refuel() {
        System.out.println("jedziesz na stację");
        System.out.println("stajesz pod dystrybutorem");
        System.out.println("tankujesz");
        System.out.println("tankujesz");
        System.out.println("płacisz");
        System.out.println("możesz jechać");
    }
}
