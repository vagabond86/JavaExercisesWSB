import creatures.Animal;
import creatures.Human;
import devices.Car;

public class Main {
    public static void main(String[] args) {

        Human Kamil = new Human("Kamil");
        Animal dog = new Animal("Reksio", "dog", 11.0, true);
        Car tesla = new Car("Model X", "Tesla", 2022, 4, "black", 450000.0);

        Kamil.setAnimal(dog);
        System.out.println(dog.name + " waży: " + dog.getWeight());
        dog.feed();
        System.out.println(dog.name + " waży: " + dog.getWeight());
        dog.takeForAWalk();
        System.out.println(dog.name + " waży: " + dog.getWeight());

        Kamil.setSalary(40000.0);
        Double currentSallary = Kamil.getSalary();
        System.out.println("Aktualna wypłata: " + currentSallary);

        Kamil.setCar(tesla);
        String currentCar = Kamil.getCar();
        System.out.println("Aktualny samochód: " + tesla.getValue());


    }
}

