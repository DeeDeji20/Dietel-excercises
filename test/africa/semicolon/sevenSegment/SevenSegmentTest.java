package africa.semicolon.sevenSegment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentTest {

    @BeforeEach
    void setUp() {
    }

    //test that seven segment exists
    @Test
    void testThatSevenSegmentExists() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        int[][] returnedSegment = segment.getSegment();
        //assert
        assertArrayEquals(new int[5][4], returnedSegment);

    }

    @Test
    void testThatSideACanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentA("10000000");
        //assert
        int[][] expectedArray = {{1,1,1,1}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }

    @Test
    void testThatSideBCanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentB("01000000");
        //assert
        int[][] expectedArray = {{0,0,0,1}, {0,0,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,0,0}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }

    @Test
    void testThatSideCCanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentC("00100000");
        //assert
        int[][] expectedArray = {{0,0,0,0}, {0,0,0,0}, {0,0,0,1}, {0,0,0,1}, {0,0,0,1}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }

    @Test
    void testThatSideDCanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentD("00010000");
        //assert
        int[][] expectedArray = {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {1,1,1,1}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }
    @Test
    void testThatSideECanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentE("00001000");
        //assert
        int[][] expectedArray = {{0,0,0,0}, {0,0,0,0}, {1,0,0,0}, {1,0,0,0}, {1,0,0,0}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }

    @Test
    void testThatSideFCanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentF("00000100");
        //assert
        int[][] expectedArray = {{1,0,0,0}, {1,0,0,0}, {1,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }

    @Test
    void testThatSideGCanBeTurnedOn() {
        //given
        SevenSegment segment = new SevenSegment();
        //when
        segment.setSegmentG("00000010");
        //assert
        int[][] expectedArray = {{0,0,0,0}, {0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0}};
        assertArrayEquals(expectedArray, segment.getSegment());
    }
}