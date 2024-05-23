package structural.decorator.animalDecorator;

public class LionDecorator extends AnimalDecorator{

    public LionDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String move() {
        return super.move() + " the lion walks";
    }
}
