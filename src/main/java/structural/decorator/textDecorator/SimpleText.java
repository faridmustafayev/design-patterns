package structural.decorator.textDecorator;

public class SimpleText implements Text{
    @Override
    public String textFormat() {
        return " <- text format -> ";
    }
}
