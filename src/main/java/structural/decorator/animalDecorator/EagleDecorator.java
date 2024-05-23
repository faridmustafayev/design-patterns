package structural.decorator.animalDecorator;

public class EagleDecorator extends AnimalDecorator{

    public EagleDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String move() {
        return super.move() + " the eagle flies";
    }
}
