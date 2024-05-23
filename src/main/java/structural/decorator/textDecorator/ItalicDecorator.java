package structural.decorator.textDecorator;

public class ItalicDecorator extends TextDecorator{

    public ItalicDecorator(Text textDecorator) {
        super(textDecorator);
    }

    @Override
    public String textFormat() {
        return "<i> " + super.textFormat() + " </i> ";
    }
}
