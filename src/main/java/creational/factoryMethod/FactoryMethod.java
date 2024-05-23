package creational.factoryMethod;

public class FactoryMethod {
    public static Shape createShape(ShapeType type) {
        return switch (type) {
            case RECTANGLE -> new Rectangle("black", 4, 5);
            case CIRCLE -> new Circle("white", 6);
        };
    }
}
