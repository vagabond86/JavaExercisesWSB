package creatures;

import devices.Car;
import devices.Phone;

import java.util.Date;
import java.util.List;

public class Human extends Animal {
    public static final Integer DEFAULT_GARAGE_SIZE = 3;
    private static final Double DEFAULT_HUMAN_WEIGHT = 80.0;
    private static final String HUMAN_SPECIE = "homo sapiens";
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    Boolean property;
    private Double salary;
    public Double cash;

    private Car[] garage; // nowa lista samochodów


    public Human(String firstName) {
        super(HUMAN_SPECIE, DEFAULT_HUMAN_WEIGHT);
        this.firstName = firstName;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(String firstName, Integer garageSize) {
        super(HUMAN_SPECIE, DEFAULT_HUMAN_WEIGHT);
        this.firstName = firstName;
        this.cash = 0.0;
        this.garage = new Car[garageSize];
    }

    //getter garage
    public List<Car> getGarage() {
        return List.of(garage);
    }

    // getter salary
    public Double getSalary() {
        System.out.println("Pobieranie danych o wypłacie o godzinie: " + new Date());
        System.out.println("Aktualna wypłata: " + salary);
        return salary;
    }

    // setter salary
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie można przypisać ujemnej wartości wypłaty!");
        } else {
            System.out.println("Nowe dane wysyłane do systemu księgowego.");
            System.out.println("Konieczne odebranie aneksu do umowy od Pani Hani z kadr.");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty. Nie ma sensu ukrywać dochodu.");
            this.salary = salary;
        }
    }

    //setter do zadania 5
//    public void setCar(Integer parkingSpace, Car car) {
//        if (parkingSpace < 0 || parkingSpace >= this.garage.length) {
//            System.out.println("Nie ma takiego miejsca w garażu!");
//        } else {
//            if (this.salary > car.getValue()) {
//                System.out.println("Udało się kupić samochód za gotówkę");
//                garage.set(parkingSpace, car);
//            } else if (this.salary > car.getValue() / 12) {
//                System.out.println("Udało się kupić samochód na kredyt(no trudno)!");
//                garage.set(parkingSpace, car);
//            } else {
//                System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
//            }
//        }
//    }


    public Car getCar(Integer parkingSpace) {
        if (parkingSpace < 0 || parkingSpace >= this.garage.length) {
            System.out.println("Nie ma takiego miejsca w garażu!");
            return null;
        } else {
            return this.garage[parkingSpace];
        }
    }

    public Double sumGarageValue() {
        Double sum = 0.0;
        for (Car car : this.garage) {
            if (car != null)
                sum += car.getValue();
        }
        return sum;
    }


    // toString() method
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public void feed(Double foodWeight) {

    }


    public boolean hasCar(Car newCar) {
        boolean humanHasCar = false;
        for (Car car : this.garage) {
            if (car == newCar) {
                humanHasCar = true;
                break;
            }
        }
        return humanHasCar;
    }


    public boolean hasFreeParkingSpace() {
        boolean humanHasFreeParkingSpace = false;
        for (Car car : this.garage) {
            if (car == null) {
                humanHasFreeParkingSpace = true;
                break;
            }
        }
        return humanHasFreeParkingSpace;

    }

    public void removeCar(Car carToRemove) throws Exception {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == carToRemove) {
                this.garage[i] = null;
                return;
            }
        }
        throw new Exception("Nie znaleziono samochodu w garażu.");
    }

    public void addCar(Car carToAdd) throws Exception {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = carToAdd;
                return;
            }
        }
        throw new Exception("Brak wolnych miejsc w garażu.");
    }

}
