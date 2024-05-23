package structural.decorator.coffeeDecorator;

public class Main {
    public static void main(String[] args) {

        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkDecorator = new MilkDecorator(simpleCoffee);

        System.out.println(milkDecorator.description());
        System.out.println(milkDecorator.cost());

    }
}
