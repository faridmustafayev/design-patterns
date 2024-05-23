package structural.bridge.bridgeVehicle;

public class Bike extends Vehicle {

    public Bike(DrivingMode drivingMode) {
        super(drivingMode);
    }

    @Override
    void drive() {
        drivingMode.start();
        System.out.println("Bike is driving");
        drivingMode.stop();
    }
}
