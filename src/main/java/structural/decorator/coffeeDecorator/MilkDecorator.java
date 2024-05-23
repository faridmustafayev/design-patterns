package structural.decorator.coffeeDecorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.8;
    }

    @Override
    public String description() {
        return super.description() + " with milk";
    }

}
