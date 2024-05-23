package structural.decorator.textDecorator;

public class BoldDecorator extends TextDecorator{

    public BoldDecorator(Text textDecorator) {
        super(textDecorator);
    }

    @Override
    public String textFormat() {
        return "/b " + super.textFormat() + " < /b >";
    }
}
