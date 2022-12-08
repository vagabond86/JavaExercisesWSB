package devices;

public class Car {
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

    public String getModel(){
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
    public String toString(){
        return producer+" "+model+", color: "+color+", value: "+value;
    }
}
