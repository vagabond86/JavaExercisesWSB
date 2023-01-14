package devices;

import creatures.Salleable;

public abstract class Devices implements Salleable {
    public final Integer id;

    public Devices(Integer id) {
        this.id = id;
    }

    abstract void turnOn();
}
