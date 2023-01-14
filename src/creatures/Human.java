package creatures;

import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human extends Animal implements Salleable {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car car;
    Boolean property;
    private Double salary;
    private String cars;
    public Double cash;

    public Human(String firstName, String lastName) {
        super("Kamil", "homo sapiens", 80.0, true);
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = 0.0;
        this.property = property;
    }

    //getter car
    public String getCar() {
        return cars;
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

    //setter check if you could buy it
    public void setCar(Car car) {
        if (this.salary > car.getValue()) {
            System.out.println("Udało się kupić samochód za gotówkę");
        } else if (this.salary > car.getValue() / 12) {
            System.out.println("Udało się kupić samochód na kredyt(no trudno)!");
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
        }
    }

    // toString() method
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public void feed(Double foodWeight) {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
    }
}
