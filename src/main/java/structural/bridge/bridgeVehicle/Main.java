package structural.bridge.bridgeVehicle;

public class Main {
    public static void main(String[] args) {

        DrivingMode manualMode = new ManualDriving();
        Vehicle bike = new Bike(manualMode);
        bike.drive();

    }
}
