package structural.adapter.animal;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        tiger.run();

        Animal lion = new AdapterLion(new Lion());
        lion.run();

    }
}