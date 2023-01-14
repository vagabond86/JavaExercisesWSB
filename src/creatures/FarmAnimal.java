package creatures;

public class FarmAnimal extends Animal implements Edible{
    public FarmAnimal(String name, String species, Double weight, Boolean isAlive, Boolean owner) {
        super(name, species, weight, isAlive);
        this.owner = owner;
    }

    @Override
    public void beEaten() {
        super.beEaten();
        this.isAlive = false;
        this.weight = 0.0;
    }

    @Override
    public void feed(Double foodWeight) {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
