package devices;

public class Phone {
    private String producer;
    private Integer displaySize;
    private Integer batteryCapacity;
    private Integer internalStorage;
    private String os;

    public Phone(String producer, Integer displaySize, Integer batteryCapacity, Integer internalStorage, String os) {
        this.producer = producer;
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.internalStorage = internalStorage;
        this.os = os;
    }
}
