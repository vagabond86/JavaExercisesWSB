package devices;

import creatures.Salleable;

public abstract class Devices implements Salleable {
    public Devices(Integer id, String producer, String model) {
        this.id = id;
        this.producer = producer;
        this.model = model;
    }

    public final Integer id;
    public final String producer;
    public final String model;


    abstract void turnOn();
}
