package structural.facade.shapeFacade;

public class ShapeFacade {
    private Square square;
    private Circle circle;
    private Rectangular rectangular;

    public ShapeFacade() {
        square = new Square();
        circle = new Circle();
        rectangular = new Rectangular();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangular.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}
