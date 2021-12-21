package africa.semicolon.bike;

public class Bike {

    private boolean isOn;
    private int gear;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        if (isOn) isOn = false;
    }

    public void turnOn() {
        if (!isOn) isOn = true;
    }

    public void accelerate() {
        if (isOn) {
            if (speed > 40) {
                gear = 4;
                speed += 4;
            }
            if (speed > 30 && speed <= 40) {
                gear = 3;
                speed += 3;
            }
            if (speed > 20 && speed <= 30) {
                gear = 2;
                speed += 2;
            }
            if (speed >= 0 && speed <= 20) {
                gear = 1;
                speed++;
            }
        }
        else speed=0;
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate() {
        if (isOn && speed > 0) {
            if (speed > 40){
                gear =4;
                speed -= 4;
            }
            if (speed > 30 && speed <= 40){
                gear = 3;
                speed -= 3;
            }
            if (speed >= 20 && speed <= 30){
                gear = 2;
                speed -= 2;
            }
            if (speed < 20){
                gear = 1;
                speed -= 1;
            }
        }else  speed =0;
    }

    public int getGear(){
        return gear;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "isOn=" + isOn +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
