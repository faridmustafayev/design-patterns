package structural.decorator.animalDecorator;

public class SimpleAnimal implements Animal{

    @Override
    public String move() {
        return "all animals can move but different position, for example: ";
    }
}
