package creatures;

public class Pet extends Animal{
    public Pet(String name, String species, Double weight, Boolean isAlive, Boolean owner)  {
        super(name, species, weight, isAlive);
        this.owner = owner;
    }

    @Override
    public void feed(Double foodWeight) {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(!this.name.equals(owner));

    }
}
