package africa.semicolon.chapterEight.fanClass;

public class FanClass {
    private Speed fanSpeed;
    private boolean isOn;
    private  double radius;
    private String color;

    public FanClass(Speed fanSpeed, boolean isOn) {
        this.fanSpeed = fanSpeed;
        this.isOn = isOn;
        this.radius = 5.0;
        this.color = "blue";
    }

    public Speed getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(Speed fanSpeed) {
        this.fanSpeed = fanSpeed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn){
            return "FanClass{" +
                    "fanSpeed=" + fanSpeed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
        return "FanClass{" +
                ", Fan is off" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
