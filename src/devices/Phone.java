package devices;

import creatures.Human;

public class Phone extends Devices {
    private static final String DEFAULT_SERVER_ADDRESS = "Android.com";
    private static final String DEFAULT_APP_VERSION = "latest_stable_version";
    private String producer;
    private String model;
    private Double displaySize;
    private Integer batteryCapacity;
    private Integer internalStorage;
    private String os;

    public Phone(Integer id, String producer, String model, Double displaySize, Integer batteryCapacity, Integer internalStorage, String os) {
        super(id);
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("sorry, nie masz kasy");
        } else if (seller.phone != this) {
            System.out.println("błąd");

        } else {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = this;
            seller.phone = null;
            System.out.println("transakcja udana, telefon sprzedany");
        }
    }

    @Override
    void turnOn() {

    }

    public void installApp(String appName) {
        this.installApp(appName, DEFAULT_APP_VERSION);
    }

    public void installApp(String appName, String appVersion) {
        this.installApp(appName, appVersion, DEFAULT_SERVER_ADDRESS);
    }

    public void installApp(String appName, String appVersion, String serverAddress) {
        System.out.println("Sprawdzam płatność dla " + appName + " w wersji " + appVersion + " z serwera " + serverAddress);
        System.out.println("Sprawdzam kontrolę rodzicielską dla " + appName + " w wersji " + appVersion + " z serwera " + serverAddress);
        System.out.println("Sprawdzam ilość wymaganego miejsca w pamięci dla " + appName + " w wersji " + appVersion + " z serwera " + serverAddress);
        System.out.println("Aplikacja " + appName + " w wersji " + appVersion + " została zainstalowana z serwera " + serverAddress);
    }
}


//    public void installApp(List<String> appNames) {
//        for (String appName : appNames) {
//            this.installApp(appName);
//        }
//    }

