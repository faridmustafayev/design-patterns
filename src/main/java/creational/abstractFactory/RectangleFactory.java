package creational.abstractFactory;

public class RectangleFactory implements FactoryShape {

    @Override
    public Shape createShape() {
        return new Rectangle("blue", 8, 9);
    }
}
