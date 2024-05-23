package structural.bridge.bridgeDevice;

public class BasicController implements DeviceController{
    @Override
    public void powerOn() {
        System.out.println("Basic Controller: power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Basic Controller: power off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Basic Controller: set volume " + volume);
    }
}
