package creational.builder.carBuilder;

public class Car {
    private final int doorNumber;
    private final String color;
    private final String model;
    private final String engine;

    private Car(CarBuilder builder) {
        this.doorNumber = builder.doorNumber;
        this.color = builder.color;
        this.model = builder.model;
        this.engine = builder.engine;
    }

    static CarBuilder builder(String color) {
        return hiddenBuilder().setColor(color);
    }

    static CarBuilder hiddenBuilder() {
        return new CarBuilder();
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorNumber=" + doorNumber +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static class CarBuilder {
        private int doorNumber;
        private String color;
        private String model;
        private String engine;

        public CarBuilder() {

        }

        public CarBuilder setDoorNumber(int doorNumber) {
            this.doorNumber = doorNumber;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }


        public Car build() {
            return new Car(this);
        }


    }


}