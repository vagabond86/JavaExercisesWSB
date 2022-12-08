package devices;

public class Phone {
    private String producer;
    private String model;
    private Double displaySize;
    private Integer batteryCapacity;
    private Integer internalStorage;
    private String os;

    public Phone(String producer, String model, Double displaySize, Integer batteryCapacity, Integer internalStorage, String os) {
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
}
