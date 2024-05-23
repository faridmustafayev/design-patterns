package structural.bridge.bridgeDevice;

public class Main {
    public static void main(String[] args) {

        DeviceController deviceController = new AdvancedController();
        Device television = new Television(deviceController);
        television.powerOn();
        television.setVolume(20);
        television.powerOff();

    }
}
