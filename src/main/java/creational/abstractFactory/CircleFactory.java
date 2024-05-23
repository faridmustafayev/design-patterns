package creational.abstractFactory;

public class CircleFactory implements FactoryShape {

    @Override
    public Shape createShape() {
        return new Circle("grey", 2);
    }

}
