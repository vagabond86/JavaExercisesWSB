import creatures.Animal;
import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Kamil", "Górzyński");
        Human human1 = new Human("Katarzyna", "Nowak");
        Human human2 = new Human("Piotr", "Kowalski");
        Human human3 = new Human("Anna", "Wojciechowska");
        Human human4 = new Human("Marcin", "Zieliński");
        Human human5 = new Human("Agnieszka", "Woźniak");

        Animal animal = new Animal("Reksio", "dog", 11.0, true);
        Animal animal1 = new Animal("Buddy", "dog", 50.0, true);
        Animal animal2 = new Animal("Fluffy", "cat", 10.0, true);
        Animal animal3 = new Animal("Tweety", "bird", 1.0, true);
        Animal animal4 = new Animal("George", "monkey", 15.0, true);
        Animal animal5 = new Animal("Nemo", "fish", 0.5, true);

        Car car = new Car("Model X", "Tesla", 2022, 4, "black", 450000.0);
        Car car1 = new Car("Corolla", "Toyota", 2021, 4, "white", 25000.00);
        Car car2 = new Car("Civic", "Honda", 2020, 4, "silver", 23000.00);
        Car car3 = new Car("Accord", "Honda", 2019, 4, "black", 27000.00);
        Car car4 = new Car("Altima", "Nissan", 2018, 4, "red", 22000.00);
        Car car5 = new Car("Camry", "Toyota", 2017, 4, "gray", 24000.00);

        Phone phone = new Phone("Google", "Pixel 6", 6.4, 4300, 256, "android 13");
        Phone phone1 = new Phone("Apple", "iPhone 12", 6.1, 2815, 128, "iOS 14");
        Phone phone2 = new Phone("Samsung", "Galaxy S20", 6.2, 4500, 256, "Android 10");
        Phone phone3 = new Phone("Google", "Pixel 4", 5.7, 2800, 64, "Android 11");
        Phone phone4 = new Phone("OnePlus", "8T", 6.5, 4500, 128, "Android 11");
        Phone phone5 = new Phone("Huawei", "P40 Pro", 6.58, 4200, 256, "Android 10");

        //pets feeding process
        human.setAnimal(animal);
        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");
        animal.feed();
        animal.feed();
        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");
        animal.takeForAWalk();
        animal.takeForAWalk();
        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");

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
        System.out.println("Human: " + human5);
        System.out.println("Phone: " + phone1);
        System.out.println("Human: " + human2);
        System.out.println("Animal: " + animal3);
        System.out.println("Car: " + car3);

        //equals()
        String str1 = new String("Ala ma kota");
        String str2 = new String("Ala ma kota");

        //porównanie obiektów
        if (str1.equals(str2)) {
            System.out.println("Obiekty str1 i str2 są sobie równe");
        } else {
            System.out.println("Obiekty str1 i str2 są od siebie różne");
        }
    }
}

