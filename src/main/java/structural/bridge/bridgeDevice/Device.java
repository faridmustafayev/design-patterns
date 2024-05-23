package structural.bridge.bridgeDevice;

public abstract class Device {
    protected DeviceController deviceController;

    public Device(DeviceController deviceController) {
        this.deviceController = deviceController;
    }

    abstract void powerOn();
    abstract void powerOff();
    abstract void setVolume(int volume);
}
