import devices.Application;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(01, "Google", "Pixel 6", 6.4, 4300, 256, "android 13");
        Phone phone2 = new Phone(02, "Apple", "iPhone 12", 6.1, 2815, 128, "iOS 14");
        Phone phone3 = new Phone(03, "Samsung", "Galaxy S20", 6.2, 4500, 256, "Android 10");
        Phone phone4 = new Phone(04, "Google", "Pixel 4", 5.7, 2800, 64, "Android 11");


        Application app1 = new Application("Facebook", "2023.03-01", 0.0);
        Application app2 = new Application("Instagram", "2023.03-01", 0.99);
        Application app3 = new Application("Twitter", "2023.03-01", 2.99);
        Application app4 = new Application("Snapchat", "2023.03-01", 1.99);
        Application app5 = new Application("TikTok", "2023.03-01", 0.0);
        Application app6 = new Application("YouTube", "2023.03-01", 0.0);
        Application app7 = new Application("WhatsApp", "2023.03-01", 0.0);
        Application app8 = new Application("Messenger", "2023.03-01", 0.0);
        Application app9 = new Application("Pinterest", "2023.03-01", 2.99);
        Application app10 = new Application("Spotify", "2023.03-01", 4.99);

        phone1.cash = 10.0;
        phone2.cash = 5.0;
        phone3.cash = 0.0;
        phone4.cash = -5.0;

        phone1.installApp(app1);
        phone1.installApp(app2);
        phone1.installApp(app3);
        phone1.installApp(app4);
        phone1.installApp(app5);
        phone1.installApp(app6);
        phone1.installApp(app7);
        phone1.installApp(app8);

        System.out.println(phone1.isAppInstalled("Facebook"));
        System.out.println(phone1.isAppInstalled(app1));
        System.out.println(phone2.isAppInstalled("Facebook"));

        System.out.println("Lista bezpłatnych aplikacji zainsalowanych w telefonie: ");
        phone1.printFreeApps();

        System.out.println("W telefonie zainstalowano aplikacje za łączną kwotę: " + phone1.getTotalValueOfInstalledApps());

        System.out.println("W telefonie zainstalowano następujące aplikacje: ");
        phone1.printAppsAlphabetically();

        System.out.println("W telefonie zainstalowano następujące aplikacje:");
        phone1.printAppsByPrice();


//        Human human = new Human("Kamil", "Górzyński");
//        Human human1 = new Human("Katarzyna", "Nowak");
//        Human human2 = new Human("Piotr", "Kowalski");
//        Human human3 = new Human("Anna", "Wojciechowska");
//        Human human4 = new Human("Marcin", "Zieliński");
//        Human human5 = new Human("Agnieszka", "Woźniak");
//
//        Pet animal = new Pet("Reksio", "dog", 11.0, true, true);
//        Pet animal1 = new Pet("Buddy", "dog", 50.0, true, true);
//        Pet animal2 = new Pet("Fluffy", "cat", 10.0, true, true);
//        Pet animal3 = new Pet("Tweety", "bird", 1.0, true, true);
//        Pet animal4 = new Pet("George", "monkey", 15.0, true, true);
//        Pet animal5 = new Pet("Nemo", "fish", 0.5, true, true);
//
//        Electric car = new Electric("Model X", "Tesla", 2022, 4, "black", 450000.0, 45000.0);
//        Petrol car1 = new Petrol("Corolla", "Toyota", 2021, 4, "white", 25000.00,60.0);
//        Petrol car2 = new Petrol("Civic", "Honda", 2020, 4, "silver", 23000.00, 55.0);
//        Petrol car3 = new Petrol("Accord", "Honda", 2019, 4, "black", 27000.00, 45.0);
//        Petrol car4 = new Petrol("Altima", "Nissan", 2018, 4, "red", 22000.00, 60.0);
//        LPG car5 = new LPG("Camry", "Toyota", 2017, 4, "gray", 24000.00, 80.0);
//
//
//        //pets feeding process
//        human.setAnimal(animal);
//        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");
//        animal.feed();
//        animal.feed();
//        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");
//        animal.takeForAWalk();
//        animal.takeForAWalk();
//        System.out.println(animal.name + " waży: " + animal.getWeight() + " kg");
//
//        //get your salary
//        human.setSalary(40000.0);
//        Double currentSallary = human.getSalary();
//        System.out.println("Aktualna wypłata (PLN): " + currentSallary);
//
//        //get yourself a car
//        human.setCar(car);
//        String currentCar = human.getCar();
//        System.out.println("Aktualny samochód: " + car.getModel());
//
//        System.out.println(car);
//        car.setMillage(10_000.0);
//        System.out.println("Aktualny przebieg wynosi (km): " + car.getMillage());
//
//        //toString()
//        System.out.println("Human: " + human5);
//        System.out.println("Phone: " + phone1);
//        System.out.println("Human: " + human2);
//        System.out.println("Animal: " + animal3);
//        System.out.println("Car: " + car3);
//
//        //equals()
//        String str1 = new String("Ala ma kota");
//        String str2 = new String("Ala ma kota");
//
//        //porównanie obiektów
//        if (str1.equals(str2)) {
//            System.out.println("Obiekty str1 i str2 są sobie równe");
//        } else {
//            System.out.println("Obiekty str1 i str2 są od siebie różne");
//        }
    }
}