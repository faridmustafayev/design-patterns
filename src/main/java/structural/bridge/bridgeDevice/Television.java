package structural.bridge.bridgeDevice;

public class Television extends Device{

    public Television(DeviceController deviceController) {
        super(deviceController);
    }

    @Override
    void powerOn() {
        deviceController.powerOn();
    }

    @Override
    void powerOff() {
        deviceController.powerOff();
    }

    @Override
    void setVolume(int volume) {
        deviceController.setVolume(volume);
    }
}
