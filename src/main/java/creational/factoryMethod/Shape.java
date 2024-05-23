package creational.factoryMethod;

public abstract class Shape {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public void displayColor() {
        System.out.println("Color: " + color);
    }

    abstract double getArea();
}
