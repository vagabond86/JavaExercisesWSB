package devices;

public class Car {
    private String model;
    private String producer;
    private Integer year;
    private Integer numOfDoors;
    private String color;
    private Double millage; // przebieg
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
    public void setModel(String model) {
        this.model = model;
    }

    public Double getValue() {
        return value;
    }
}
