package structural.facade.shapeFacade;

public class Main {
    public static void main(String[] args) {

        ShapeFacade facade = new ShapeFacade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();

    }
}
