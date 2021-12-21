package africa.semicolon.assignments.chibobTV;
import africa.semicolon.assignments.chibobTV.Television;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television myTV;
    @BeforeEach
    public void startPoint(){
        myTV= new Television("Samsung",20);
    }
    @Test
    public void tvCanBeTurnedOn(){
        //given that //i have a tv //tv is off
        //when i turn it on
        myTV.toggleIsOn();
        boolean checkPower = myTV.checkState();
        //check that tv comes on
        assertTrue(checkPower);
    }

    @Test
    public void tvCanBeTurnedOff(){
        //given that //i have a tv //tv is on
        myTV.toggleIsOn();
        boolean checkPower = myTV.checkState();
        assertTrue(checkPower);
        //when i turn it off
        myTV.toggleIsOn();
        checkPower = myTV.checkState();
        //check that tv goes off
        assertFalse(checkPower);
    }
    @Test
    public void tvHasVolumeAndCanBeIncreasedBy1(){
        //given that //i have a tv //tv is on
        myTV.toggleIsOn();
        assertTrue(myTV.checkState());
        //when i increase the volume
        myTV.volumeUp();
        int volume = myTV.getVolume();
        //check that the volume increases by 1
        assertEquals(1, volume);
    }

    @Test
    public void tvHasVolumeAndCanBeDecreasedBy1(){
        //given that //i have a tv //tv is on //and volume is > 0
        myTV.toggleIsOn();
        assertTrue(myTV.checkState());
        myTV.volumeUp();
        myTV.volumeUp();
        int volume = myTV.getVolume();
        assertEquals(2, volume);
        //when i decrease the volume
        myTV.volumeDown();
        int newVolume = myTV.getVolume();
        //check that the volume increases by 1
        assertEquals(1, newVolume);
    }

    @Test
    public void tvHasVolumeAndCannotBeDecreasedBelow0(){
        //given that //i have a tv //tv is on //and volume is > 0
        myTV.toggleIsOn();
        assertTrue(myTV.checkState());
        myTV.volumeUp();
        int volume = myTV.getVolume();
        assertEquals(1, volume);
        //when i decrease the volume
        myTV.volumeDown();
        myTV.volumeDown();
        int newVolume = myTV.getVolume();
        //check that the volume increases by 1
        assertEquals(0, newVolume);
    }

    @Test
    public void tvCannotBeIncreasedAbove100(){
        //given that //i have a tv //tv is on
        myTV.toggleIsOn();
        assertTrue(myTV.checkState());
        //when i increase volume above 100
        for (int i = 0; i<101; i++){
            myTV.volumeUp();
        }
        //check that the volume increases by 1
        int volume = myTV.getVolume();
        assertEquals(100, volume);
    }
    @Test
    public void tvCannotBeIncreasedWhenOff(){
        //given that my tv is off
        boolean state= myTV.checkState();
        assertFalse(state);
        // when i increase volume
        myTV.volumeUp();
        //check that volume is 0;
        assertEquals(0, myTV.getVolume());
    }

    @Test
    public void tvCannotBeDecreasedWhenOff(){
        //given that my tv is off
        boolean state= myTV.checkState();
        assertFalse(state);
        myTV.volumeUp();
        myTV.volumeUp();
        // when i decrease volume
        myTV.volumeDown();
        //check that volume is 0;
        assertEquals(0, myTV.getVolume());
    }

    @Test
    public void changeChannelOnArrowUp(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //my channeel should be set to 1
        myTV.setChannel(1);
        assertEquals(1, myTV.getChannel());
        //when i click the arrow up botton the channel changes by 1
        myTV.arrowUp();
        //check that channel changes by 1
        assertEquals(2, myTV.getChannel());
    }
    //    @Test
//    public void cannotChangeChannelOnArrowUpWhenItExceedsNumberOfChannel(){
//        //given that my tv is on
//        myTV.toggleIsOn();
//        boolean state= myTV.checkState();
//        assertTrue(state);
//        //my channeel should be set to 1
//        myTV.setChannel(1);
//        assertEquals(1, myTV.getChannel());
//        //when i click the arrow up botton the channel changes by 1
//        for (int i =0; i< 20; i++){
//            myTV.arrowUp();
//        }
//        //check that channel changes by 1
//        assertEquals(20, myTV.getChannel());
//    }
    @Test
    public void channelOnArrowUpCannotBeChangedWhenOff(){
        //given that my tv is off
        boolean state= myTV.checkState();
        assertFalse(state);
        myTV.setChannel(1);
        //when i click the arrow up botton the channel changes by 1
        myTV.arrowUp();
        assertEquals(0, myTV.getChannel());
    }

    @Test
    public void changeChannelOnArrowDown(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //my channeel should be set to 1
        myTV.setChannel(1);
        assertEquals(1, myTV.getChannel());
        // i click the arrow up botton the channel changes by 1
        myTV.arrowUp();
        myTV.arrowUp();
        //when i click arrow down channel decreases by 1
        myTV.arrowDown();
        //check that channel changes by 1
        assertEquals(2, myTV.getChannel());
    }

    @Test
    public void cannotChangeChannelOnArrowDownToNegativeValue(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //my channeel should be set to 1
        myTV.setChannel(1);
        assertEquals(1, myTV.getChannel());

        //when i click arrow down channel decreases by 1
        myTV.arrowDown();
        //check that channel changes by 1
        assertEquals(1, myTV.getChannel());
    }
    @Test
    public void channelOnArrowDownCannotBeChangedWhenOff(){
        //given that my tv is off
        boolean state= myTV.checkState();
        assertFalse(state);
        myTV.setChannel(1);
        //when i click the arrow up botton the channel changes by 1
        myTV.arrowDown();
        assertEquals(0, myTV.getChannel());
    }
    @Test
    public void getChannelTest(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //when i change channel
        myTV.setChannel(20);
        //check that a user can set tv channel to desired channel
        int tvChannel = myTV.getChannel();
        assertEquals(20, tvChannel);
    }

    @Test
    public void cannotGetChannelWhenOffTest(){
        //given that my tv is off
        boolean state= myTV.checkState();
        assertFalse(state);
        //when i set channel
        myTV.setChannel(20);
        //check that it returns 0
        assertEquals(0, myTV.getChannel());
    }

    @Test
    public void checkThatUserCannotInputGretaerThanTheChannelNumber(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //when i change channel to a number greater than channel
        myTV.setChannel(21);
        //check that it returns the hughest channel
        int tvChannel = myTV.getChannel();
        assertEquals(20, tvChannel);
    }

    @Test
    public void checkThatUserCannotInputNegativeChannelNumber(){
        //given that my tv is on
        myTV.toggleIsOn();
        boolean state= myTV.checkState();
        assertTrue(state);
        //when i change channel to a number less than 0
        myTV.setChannel(-5);
        //check that it returns the hughest channel
        int tvChannel = myTV.getChannel();
        assertEquals(1, tvChannel);
    }
}