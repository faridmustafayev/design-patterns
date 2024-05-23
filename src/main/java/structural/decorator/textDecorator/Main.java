package structural.decorator.textDecorator;

public class Main {
    public static void main(String[] args) {

        Text simpleText = new SimpleText();

        Text bold = new BoldDecorator(simpleText);
        System.out.println(bold.textFormat());

    }
}
