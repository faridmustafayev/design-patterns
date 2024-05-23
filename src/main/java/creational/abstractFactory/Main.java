package creational.abstractFactory;

import static creational.abstractFactory.ShapeType.CIRCLE;

public class Main {
    public static void main(String[] args) {

        var factoryShape = createShapeFactory(CIRCLE);
        var shape = factoryShape.createShape();
        shape.displayColor();
        System.out.println(shape.getArea());

    }

    private static FactoryShape createShapeFactory(ShapeType type) {
        return switch (type) {
            case CIRCLE -> new CircleFactory();
            case RECTANGLE -> new RectangleFactory();
        };
    }

}
