package structural.decorator.animalDecorator;

public class AnimalDecorator implements Animal{
    protected Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String move() {
        return animal.move();
    }
}
