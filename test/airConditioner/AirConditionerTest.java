package airConditioner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    AirConditioner myAc;
    @BeforeEach
    public void startPoint(){
        myAc = new AirConditioner("hiSense");
    }

    @Test
    public void airConditionerCanBeTurnedOn(){
        //given that i have an ac and ac is off
        myAc.turnAcOff();
        boolean checkThatAcIsOn = myAc.isOn();
        assertFalse(checkThatAcIsOn);
        //when i turn it on
        myAc.turnAcOn();
        //check that ac is on
        assertTrue(myAc.isOn());
    }

    @Test
    public void airConditionerCanBeTurnedOff(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        //when i turn it off
        myAc.turnAcOff();
        //check that ac is on
        assertFalse(myAc.isOn());
    }

    @Test
    public void airConditionerTemperatureaCanBeIncreasedBy1(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        //when i increase the temperature it increased from 16 upwards
        myAc.increaseAcTemperature();
        //check that ac increases
        int currentTemperature =myAc.getTemperature();
        assertEquals(17,currentTemperature);
    }

    @Test
    public void airConditionerTemperatureaCanBeDecreasedBy1(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        for (int i=0; i<2; i++) {
            myAc.increaseAcTemperature();
        }
        //when i decrease the temperature it decreases from 17 downwards
        myAc.decreaseAcTemperature();
        //check that ac increases
        int currentTemperature =myAc.getTemperature();
        assertEquals(17,currentTemperature);
    }

    @Test
    public void airConditionerTemperatureCantBeIncreasedBeyond30Test(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        //when i increase the temperature it doesnt go beyond 30
        for (int i=0; i<14; i++) {
            myAc.increaseAcTemperature();
        }
        myAc.increaseAcTemperature();
        //check that ac is 30
        assertEquals(30, myAc.getTemperature());
    }

    @Test
    public void airConditionerTemperatureCantBeDecreasedBelow16Test(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        //when i decrease the temperature it doesnt go beyond 30
        myAc.increaseAcTemperature();
        myAc.decreaseAcTemperature();
        myAc.decreaseAcTemperature();
        myAc.decreaseAcTemperature();
        int currentTemp = myAc.getTemperature();
        //check that ac is 30
        assertEquals(16, currentTemp);
    }

    @Test
    public void airConditionerTemperatureCantBeIncreasedWhileOffTest(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());

        //when i turn ac off and increase or decrease the temp
        myAc.turnAcOff();
        assertFalse(myAc.isOn());
        myAc.increaseAcTemperature();
        //check that it doesnt have any effect
        assertEquals(0, myAc.getTemperature());
    }

    @Test
    public void airConditionerTemperatureCantBeDecreasedWhileOffTest(){
        //given that i have an ac and it is on
        myAc.turnAcOn();
        assertTrue(myAc.isOn());
        myAc.increaseAcTemperature();
        myAc.increaseAcTemperature();
        //when i turn ac off and increase or decrease the temp
        myAc.turnAcOff();
        assertFalse(myAc.isOn());

        myAc.decreaseAcTemperature();
        //check that it doesnt have any effect
        assertEquals(0,myAc.getTemperature());
    }
}