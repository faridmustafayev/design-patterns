package structural.adapter.shape;

public class RectangleAdapter implements Shape {
    private LegacyRectangle legacyRectangle;
    private double width, height;

    public RectangleAdapter(LegacyRectangle legacyRectangle, double width, double height) {
        this.legacyRectangle = legacyRectangle;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        legacyRectangle.drawRectangle();
    }

    @Override
    public double getArea() {
        return legacyRectangle.calculateArea(width, height);
    }
}
