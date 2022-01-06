package africa.semicolon.chapterSix.temperatureConversion;

public class TemperatureConversion {
    public String celcius(int fahrenheit) {
        return String.format("%.2f", 5.0/9.0 * (fahrenheit - 32));
    }
}
