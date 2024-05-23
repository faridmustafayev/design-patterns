package structural.bridge.bridgeVehicle;

public class ManualDriving implements DrivingMode{
    @Override
    public void start() {
        System.out.println("Starting in manual mode");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in manual mode");
    }
}
