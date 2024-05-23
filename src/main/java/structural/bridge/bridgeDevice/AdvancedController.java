package structural.bridge.bridgeDevice;

public class AdvancedController implements DeviceController{
    @Override
    public void powerOn() {
        System.out.println("Advanced Controller: power on");
    }

    @Override
    public void powerOff() {
        System.out.println("Advanced Controller: power off");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Advanced Controller: set volume " + volume);
    }
}
