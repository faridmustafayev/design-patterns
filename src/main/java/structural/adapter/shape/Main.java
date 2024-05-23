package structural.adapter.shape;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(3);
        circle.draw();
        System.out.println(circle.getArea());

        System.out.println("------------------------");

        Shape rectangle = new RectangleAdapter(new LegacyRectangle(), 3, 4);
        rectangle.draw();
        System.out.println(rectangle.getArea());


    }
}
