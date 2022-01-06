package africa.semicolon.chapterSix.temperatureConversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConversionTest {
    @Test
    void createTempConversionClass(){
        TemperatureConversion temperatureConversion = new TemperatureConversion();
        String temp = temperatureConversion.celcius(120);

        assertEquals("48.89", temp);
    }
}
