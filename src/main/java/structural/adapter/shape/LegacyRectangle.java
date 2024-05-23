package structural.adapter.shape;

public class LegacyRectangle {
    public void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }

    public double calculateArea(double width, double height) {
        return width * height;
    }

}
