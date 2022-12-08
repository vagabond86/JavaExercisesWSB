package creatures;

public class Animal {

    private static final Double DEFAULT_DOG_WEIGHT = 15.0;
    private static final Double DEFAULT_CAT_WEIGHT = 5.0;
    private static final Double DEFAULT_BIRD_WEIGHT = 0.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public String name;
    public final String species;
    private Double weight;
    private Boolean isAlive;


    // gettery

    public Double getWeight() {
        return this.weight;
    }

//    public Animal(String species, Double weight) {
//        this.isAlive = true;
//        this.species = species;
//        if (weight <= 0) {
//            System.out.println("Waga jest błędna. Przypisano wartość domyślną");
//            this.weight = DEFAULT_ANIMAL_WEIGHT;
//        } else {
//            this.weight = weight;
//        }
//    }

    public Animal(String name, String species, Double weight, Boolean isAlive) {
        this.name = name;
        this.species = species;
        //ustawienie początkowej wagi na podstawie gatunku
        switch (species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "bird" -> this.weight = DEFAULT_BIRD_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
        this.weight = weight;
        this.isAlive = isAlive;
    }

    public void feed() {
        if (this.weight <= 0) {
            System.out.println(name + " nie żyje, nie może być karmiony");
            return;
        }
        // Zwiększenie wagi zwierzęcia
        switch (this.species) {
            case "dog" -> this.weight += 0.5;
            case "cat" -> this.weight += 0.2;
            case "bird" -> this.weight += 0.1;
        }
    }

    public void takeForAWalk() {
        if (this.weight <= 0) {
            System.out.println(name + " nie żyje i nie może być zabrane na spacer");
            return;
        }
        // Zmniejszenie wagi zwierzęcia
        switch (this.species) {
            case "dog" -> this.weight -= 0.2;
            case "cat" -> this.weight -= 0.1;
            case "bird" -> this.weight -= 0.05;
        }
        if (this.weight <= 0) {
            isAlive = false;
            System.out.println(name + " zdechł.");
        }
    }

    public void setAnimal(Animal dog) {
        this.name = name;
    }

    public String toString(){
        return species+": "+name+", weight: "+weight;
    }
}
