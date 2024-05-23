package structural.bridge.bridgeVehicle;

public abstract class Vehicle {
    protected DrivingMode drivingMode;

    public Vehicle(DrivingMode drivingMode) {
        this.drivingMode = drivingMode;
    }

    abstract void drive();
}
