import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Kamil", "Górzyński");
        Animal dog = new Animal("Reksio", "dog", 11.0, true);
        Car tesla = new Car("Model X", "Tesla", 2022, 4, "black", 450000.0);
        Phone pixel = new Phone("Google", "Pixel 6", 6.4, 4300, 256, "android 13");

        human.setAnimal(dog);
        System.out.println(dog.name + " waży: " + dog.getWeight() + " kg");
        dog.feed();
        dog.feed();
        System.out.println(dog.name + " waży: " + dog.getWeight() + " kg");
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println(dog.name + " waży: " +dog.getWeight() + " kg");

        human.setSalary(40000.0);
        Double currentSallary = human.getSalary();
        System.out.println("Aktualna wypłata (PLN): " + currentSallary);

        human.setCar(tesla);
        String currentCar = human.getCar();
        System.out.println("Aktualny samochód: " + tesla.getModel());

        System.out.println(tesla);
        tesla.setMillage(10_000.0);
        System.out.println("Aktualny przebieg wynosi (km): " + tesla.getMillage());

        System.out.println(tesla);
        System.out.println(pixel);
        System.out.println(human);
        System.out.println(dog);
    }
}

