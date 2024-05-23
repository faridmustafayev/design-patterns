package creational.builder.carBuilder;

public class CarTest {
    public static void main(String[] args) {

        Car car = Car.builder("white")
                .setEngine("2.4")
                .build();
        System.out.println(car);

    }
}
