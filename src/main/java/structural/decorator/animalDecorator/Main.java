package structural.decorator.animalDecorator;

public class Main {
    public static void main(String[] args) {

        Animal simpleAnimal = new SimpleAnimal();
        Animal lion = new LionDecorator(simpleAnimal);
        System.out.println(lion.move());

    }
}
