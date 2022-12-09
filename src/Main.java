import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Kamil", "Górzyński");
        Animal dog = new Animal("Reksio", "dog", 11.0, true);
        Car car = new Car("Model X", "Tesla", 2022, 4, "black", 450000.0);
        Phone pixel = new Phone("Google", "Pixel 6", 6.4, 4300, 256, "android 13");

        //pets feeding process
        human.setAnimal(dog);
        System.out.println(dog.name + " waży: " + dog.getWeight() + " kg");
        dog.feed();
        dog.feed();
        System.out.println(dog.name + " waży: " + dog.getWeight() + " kg");
        dog.takeForAWalk();
        dog.takeForAWalk();
        System.out.println(dog.name + " waży: " +dog.getWeight() + " kg");

        //get your salary
        human.setSalary(40000.0);
        Double currentSallary = human.getSalary();
        System.out.println("Aktualna wypłata (PLN): " + currentSallary);

        //get yourself a car
        human.setCar(car);
        String currentCar = human.getCar();
        System.out.println("Aktualny samochód: " + car.getModel());

        System.out.println(car);
        car.setMillage(10_000.0);
        System.out.println("Aktualny przebieg wynosi (km): " + car.getMillage());

        //toString()
        System.out.println(car);
        System.out.println(pixel);
        System.out.println(human);
        System.out.println(dog);

        //equals()
        String str1 = new String("Ala ma kota");
        String str2 = new String("Ala ma kota");
        //porównanie obiektów
        if(str1.equals(str2)){
            System.out.println("Obiekty str1 i str2 są sobie równe");
        }else{
            System.out.println("Obiekty str1 i str2 są od siebie różne");
        }
    }
}

