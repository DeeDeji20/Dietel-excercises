package africa.semicolon.assignments.chibobTV;

public class Television {
    private boolean isOn= false;
    private int volume;
    private int numOfChannels=1 ;
    int totalChannel =20;
    public Television(String name, int numOfChannels) {
        this.numOfChannels =numOfChannels;
    }

    public void toggleIsOn() {
        if (isOn == false){
            isOn = true;
        }
        else if (isOn == true){
            isOn = false;
        }
    }

    public boolean checkState() {
        return isOn;
    }

    public void volumeUp() {
        if (isOn && volume < 100) volume++;
    }

    public void volumeDown() {
        if (isOn && volume >0) volume--;
    }

    public int getVolume() {
        if (isOn) return volume;
        return 0;
    }

    public void setChannel(int channel) {
        if (isOn && channel < totalChannel) numOfChannels = channel;
        if (isOn && channel < 1) numOfChannels = 1;
    }

    public int getChannel() {
        if (isOn) return numOfChannels;
        else return 0;
    }

    public void arrowUp() {
        if (isOn) numOfChannels ++;
        else numOfChannels = 1;
    }

    public void arrowDown() {
        if (isOn && numOfChannels > 1) numOfChannels--;
        else numOfChannels = 1;
    }

    @Override
    public String toString() {
        return "Television{\n" +
                "isOn=" + isOn +
                ",\n volume=" + volume +
                ",\n numOfChannels=" + numOfChannels +
                ",\n total channel=" + totalChannel +
                '}';
    }

}
