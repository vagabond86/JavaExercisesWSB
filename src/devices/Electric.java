package devices;

public class Electric extends Car {
    public Double suplyVoltage;


    public Electric(String model, String producer, Integer year, Integer numOfDoors, String color, Double value, Double suplyVoltage) {
        super(model, producer, year, numOfDoors, color, value);
        this.suplyVoltage = suplyVoltage;
        System.out.println("Utworzono samochód z elektryczny");
    }

    @Override
    void refuel() {
        System.out.println("podłącz przewód");
        System.out.println("czekasz");
        System.out.println("czekasz");
        System.out.println("czekasz");
        System.out.println("czekasz");
        System.out.println("naładowane, możesz jechać");
    }
}
