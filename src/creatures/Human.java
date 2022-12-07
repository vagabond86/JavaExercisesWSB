package creatures;

import devices.Car;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public Animal pet;
    Boolean property;
    private Double salary;
    private String car;

    public Human(String firstName) {
        super("Kamil","homo sapiens",80.0, true);
        this.firstName = firstName;
    }


    // getter do wypłaty
    public Double getSalary() {
        System.out.println("Pobieranie danych o wypłacie. Aktualna wypłata: " + salary);
        return salary;
    }
    //getter do pola car
    public String getCar() {
        return car;
    }

    // setter do wypłaty
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

    //setter czy stać człowieka na samochód
    public void setCar(Car car){
        if(this.salary > car.getValue()) {
            System.out.println("Udało się kupić samochód za gotówkę");
        } else if (this.salary> car.getValue()/12) {
            System.out.println("Udało się kupić samochód na kredyt(no trudno)!");

        }else{
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę.");
        }
    }
}
