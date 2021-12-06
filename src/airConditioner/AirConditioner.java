package airConditioner;

public class AirConditioner {
    private  String acName;
    private boolean isOn;
    private int temperature =16;

    public AirConditioner(String acName) {
        this.acName = acName;
    }

    public void turnAcOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnAcOff() {
        isOn = false;
        temperature =0;
    }

    public void increaseAcTemperature() {
        if (isOn && temperature < 30) temperature++;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseAcTemperature() {
        if (isOn && temperature >16) temperature--;
    }
}
