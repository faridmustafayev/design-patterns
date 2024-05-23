package structural.decorator.textDecorator;

public class TextDecorator implements Text{
    protected Text textDecorator;

    public TextDecorator(Text textDecorator) {
        this.textDecorator = textDecorator;
    }

    @Override
    public String textFormat() {
        return textDecorator.textFormat();
    }
}
