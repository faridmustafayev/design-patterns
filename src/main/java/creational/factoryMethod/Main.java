package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {

        Shape shape = FactoryMethod.createShape(ShapeType.CIRCLE);
        System.out.println(shape.getArea());
        shape.displayColor();

    }

}
