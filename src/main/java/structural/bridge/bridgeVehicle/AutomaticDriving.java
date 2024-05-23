package structural.bridge.bridgeVehicle;

public class AutomaticDriving implements DrivingMode{
    @Override
    public void start() {
        System.out.println("Starting in automatic mode");
    }

    @Override
    public void stop() {
        System.out.println("Stopped in automatic mode");
    }
}
