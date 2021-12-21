package africa.semicolon.bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    Bike myBike;
    @BeforeEach
    public void startPoint(){
        myBike = new Bike();
    }
    @Test
    public void bikeCanBeTurnedOnTest(){
        //given that i have a bike and bike is off
        myBike.turnOff();
        boolean bikeIsOn = myBike.isOn();
        assertFalse(bikeIsOn);
        //when i turn bike on
        myBike.turnOn();
        bikeIsOn = myBike.isOn();
        // check that it on
        assertTrue(bikeIsOn);
    }
    @Test
    public void bikeCanBeTurnedOffTest(){
        //given that i have a bike and bike is on
        myBike.turnOn();
        assertTrue(myBike.isOn());
        //when i turn bike off
        myBike.turnOff();
        //check that bike goes off
        assertFalse(myBike.isOn());
    }

    @Test
    public void bikeCanBeAcceleratedBy1Test(){
        //given that i have a bike and bike is on
        myBike.turnOn();
        assertTrue(myBike.isOn());
        //when bike is on gear 1, it accelerates by 1
        for (int i = 0; i < 19; i++) {
            myBike.accelerate();
        }
//        myBike.setGear();
        int bikeGear = myBike.getSpeed();
        assertEquals(19, bikeGear);
    }
    @Test
    public void bikeCanBeAcceleratedBy2Test(){
        //given that i have a bike and bike is on
        myBike.turnOn();
        assertTrue(myBike.isOn());
        //when bike is on gear 2, it accelerates by 2
        for (int i = 0; i < 21; i++) {
            myBike.accelerate();
        }
        myBike.accelerate();
        //check that bike increases by 2
        assertEquals(23, myBike.getSpeed());
    }

    @Test
    public void bikeCanBeAcceleratedBy3Test(){
        //given that i have a bike and bike is on
        myBike.turnOn();
        assertTrue(myBike.isOn());
        //when bike is on gear 3, it accelerates by 3
        for (int i = 0; i < 26; i++) {
            myBike.accelerate();
        }
        myBike.accelerate();
        //check that bike increases by 3
        assertEquals(34, myBike.getSpeed());

    }

    @Test
    public void bikeCanBeAcceleratedBy4Test(){
        //given that i have a bike and bike is on
        myBike.turnOn();
        assertTrue(myBike.isOn());
        //when bike is on gear 3, it accelerates by 3
        for (int i = 0; i < 31; i++) {
            myBike.accelerate();
        }
//        myBike.accelerate();
//        myBike.accelerate();
        //check that bike increases by 3
        assertEquals(47, myBike.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedBy4Test(){
        //given that i have a bike and bike is on and is accelearted to gear 4
        myBike.turnOn();
        assertTrue(myBike.isOn());
        for (int i = 0; i < 32; i++) {
            myBike.accelerate();
        }
        assertEquals(51, myBike.getSpeed());
        //when i decelerate
        myBike.decelerate();
        //check that speed reduces by 4
        assertEquals(47, myBike.getSpeed());
    }

    @Test
    public void bikeCanBeDeceleratedBy3Test(){
        //given that i have a bike and bike is on and is accelearted to gear 3
        myBike.turnOn();
        assertTrue(myBike.isOn());
        for (int i = 0; i < 27; i++) {
            myBike.accelerate();
        }
        assertEquals(34, myBike.getSpeed());
        //when i decelerate
        myBike.decelerate();
        //check that speed reduces by 3
        assertEquals(31, myBike.getSpeed());
    }
    @Test
    public void bikeCanBeDeceleratedBy2Test(){
        //given that i have a bike and bike is on and is accelearted to gear 2
        myBike.turnOn();
        assertTrue(myBike.isOn());
        for (int i = 0; i < 22; i++) {
            myBike.accelerate();
        }
        assertEquals(23, myBike.getSpeed());
        //when i decelerate
        myBike.decelerate();
        //check that speed reduces by 2
        assertEquals(21, myBike.getSpeed());
    } @Test
    public void bikeCanBeDeceleratedBy1Test(){
        //given that i have a bike and bike is on and is accelearted to gear 1
        myBike.turnOn();
        assertTrue(myBike.isOn());
        for (int i = 0; i < 19; i++) {
            myBike.accelerate();
        }
        assertEquals(19, myBike.getSpeed());
        //when i decelerate
        myBike.decelerate();
        //check that speed reduces by 2
        assertEquals(18, myBike.getSpeed());
    }

    @Test
    public void bikeCannotBeADeceleratedToNegativeValue(){
        //given that i have a bike and bike is on and is accelearted to gear 1
        myBike.turnOn();
        assertTrue(myBike.isOn());
        myBike.accelerate();
        //when i decelerate
        myBike.decelerate();
        myBike.decelerate();
        //check that it doesnt go below 0
        assertEquals(0, myBike.getSpeed());
    }

    @Test
    public void bikeCannotBeAcceleratedWhenOff(){
        //given taht my biek is turned off
        myBike.turnOff();
        assertFalse(myBike.isOn());
        //when i accelerate
        myBike.accelerate();
        //check that it doesnt accelerate
        assertEquals(0, myBike.getSpeed());
    }

    @Test
    public void bikeCannotBeADeceleratedWhenOff(){
        myBike.accelerate();
        myBike.accelerate();
        myBike.accelerate();
        //given taht my biek is turned off
        myBike.turnOff();
        assertFalse(myBike.isOn());
        //when i decelerate
        myBike.decelerate();
        //check that bike doesnt decelerate
        assertEquals(0, myBike.getSpeed());
    }


}
