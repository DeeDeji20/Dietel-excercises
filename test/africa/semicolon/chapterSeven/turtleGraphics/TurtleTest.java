package africa.semicolon.chapterSeven.turtleGraphics;

import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle ijapa;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ijapa = new Turtle();
    }

    @Test
    public void testThatTurtleExists(){
        assertNotNull(ijapa);
    }

    @Test
    public void testThatTurtleHasAPen(){
        //given that i have a turtle
        //when  ijapa trys to get a pen
        Pen pen = ijapa.getPen();
        // test that i get a pen back
        assertNotNull(pen);
    }

    @Test
    public void testThatPenPositionIsAtDefault_Up(){
        //given that i have a turtle
        //and turtle has a pen
        Pen pen = ijapa.getPen();
        //check that the pen position is up
        assertSame(pen.getStatus(), PenState.UP);
    }

    @Test
    public void testThatPenCanGoDown(){
        //given that i have a turtle
        //and turtle has a pen
//        Pen pen = ijapa.getPen();
        //check that the pen position is up
        assertSame(ijapa.getPen().getStatus(), PenState.UP);
        //when i say pen down
        ijapa.penDown();
        assertSame(ijapa.getPen().getStatus(), PenState.DOWN);
    }

    @Test
    public void testThatWhenPenIsDownItCanGoBackUp(){
        //given that i have a turtle and turtle has a pen taht is up
        Pen pen = ijapa.getPen();
        assertSame(pen.getStatus(), PenState.UP);
        //when the pen is dowm check that it is down
        ijapa.penDown();
        assertSame(pen.getStatus(), PenState.DOWN);

        //when i set state back up, check that pen is up
        ijapa.penUp();
        assertSame(pen.getStatus(), PenState.UP);
    }

    @Test
    public void testThatTurtleCanTurnRight_WhileFacingEast(){
        assertSame(ijapa.getCurrentDirection(), Direction.EAST);
        //when
        ijapa.turnRight();
        //assert
        assertSame(ijapa.getCurrentDirection(), Direction.SOUTH);
    }

    @Test
    public void testThatTurtleCanTurnRightAndFaceWest_WhileFacingSouth(){
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnRightAndFaceNorth_WhileFacingWest(){
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }

    @Test
    //    todo face east, face north-->done
    public void testThatTurtleCanTurnRightAndFaceEast_WhileFacingNorth(){
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatTurtleCanTurnLeft(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
    }
    //todo face North, west, south
    @Test
    public void testThatTurtleCanTurnLeft_ToFaceWest(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void testThatTurtleCanTurnLeft_ToFaceSouth(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanTurnLeft_ToFaceEast(){
        ijapa.turnLeft();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertSame(Direction.EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void testThatCanMove_WhileFacingEast() throws TurtleCanFallOffTheCliffExcption {
        ijapa.penDown();
        ijapa.move(5);
        APosition expected = new APosition(0, 4);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatCanMove_WhileFacingSouth() throws TurtleCanFallOffTheCliffExcption {
        ijapa.penDown();
        ijapa.turnRight();
        ijapa.move(4);
        APosition expected = new APosition(3, 0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatCanMove_WhileFacingWest() throws TurtleCanFallOffTheCliffExcption {
        ijapa.penDown();
        ijapa.move(5);
        APosition expected = new APosition(0, 4);
        assertEquals(expected, ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
        ijapa.move(5);
        APosition expected2 = new APosition(0, 0);
        assertEquals(expected2, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatCanMove_WhileFacingNorth() throws TurtleCanFallOffTheCliffExcption {
        ijapa.penDown();
        ijapa.turnRight();
        assertSame(Direction.SOUTH, ijapa.getCurrentDirection());
        ijapa.move(5);
        APosition expected2 = new APosition(4, 0);
        assertEquals(expected2, ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH, ijapa.getCurrentDirection());
        ijapa.move(1);
        APosition expected = new APosition(4, 0);
        assertEquals(expected, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCanMarkOnBoardWhileMoving_East() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad and pen is down
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.move(4);
        //check that board is marked
        String[][] expected = {{"-", "-", "-", "-", null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
        APosition expected2 = new APosition(0, 3);
        assertEquals(expected2, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCanMarkOnBoardWhileMoving_South() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad and pen is down
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.turnRight();
        ijapa.move(4);
        //check that board is marked
        String[][] expected = {{"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
        APosition expected2 = new APosition(3, 0);
        assertEquals(expected2, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCanMarkOnBoardWhileMoving_West() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad and pen is down
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.move(4);
        String[][] expected = {{"-", "-", "-", "-", null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());

        ijapa.turnRight();  
        ijapa.move(4);
        String[][] expected4 = {{"-", "-", "-", "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, null, null}};
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        assertArrayEquals(expected4, ijapa.getSketchpad());
        ijapa.turnRight();
        ijapa.move(4);
        APosition expected2 = new APosition(3, 0);
        assertEquals(expected2, ijapa.getCurrentPosition());
        //check that board is marked
        String[][] expected3 = {{"-", "-", "-", "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {"-", "-", "-", "-", null}, {null, null, null, null, null}};
        assertArrayEquals(expected3, ijapa.getSketchpad());

    }

    @Test
    public void testThatIjapaCanMarkOnBoardWhileMoving_North() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad and pen is down
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.turnRight();
        ijapa.move(4);
        String[][] expected4 = {{"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {null, null, null, null, null}};
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        assertArrayEquals(expected4, ijapa.getSketchpad());

        ijapa.turnLeft();
//        ijapa.turnLeft();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.move(4);
        String[][] expected = {{"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {"-", "-", "-", "-", null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
        ijapa.turnLeft();
        ijapa.move(2);
        String[][] expected2 = {{"-", null, null, "-", null}, {"-", null, null, "-", null}, {"-", null, null, "-", null}, {"-", "-", "-", "-", null}, {null, null, null, null, null}};
        assertArrayEquals(expected2, ijapa.getSketchpad());
    }

    @Test
    public void testThatWhenPenIsUp_IjapaDoesntMarkOnBoard_WhileFacingEast() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        Pen pen = new Pen();
        //when i move on the skechpad
        ijapa.penUp();
        assertEquals(PenState.UP, pen.getStatus());
        ijapa.move(4);
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());

        //check that board is marked
        String[][] expected = {{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
    }

    @Test
    public void testThatWhenPenIsUp_IjapaDoesntMarkOnBoard_WhileFacingSouth() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penUp();
        ijapa.turnRight();
        ijapa.move(4);
        //check that board is marked
        String[][] expected = {{null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
        APosition expected2 = new APosition(0, 0);
        assertEquals(expected2, ijapa.getCurrentPosition());
    }

    @Test
    public void testThatIjapaCannotMarkOnBoard_WhenPenIsUp_WhileMoving_West() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.move(4);
        String[][] expected = {{"-", "-", "-", "-", null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());

        ijapa.turnRight();
        ijapa.move(4);
        String[][] expected4 = {{"-", "-", "-", "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, null, null}};
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        assertArrayEquals(expected4, ijapa.getSketchpad());
        ijapa.turnRight();
        ijapa.penUp();
        ijapa.move(4);
        APosition expected2 = new APosition(3, 3);
        assertEquals(expected2, ijapa.getCurrentPosition());
        //check that board is marked
        String[][] expected3 = {{"-", "-", "-", "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, "-", null}, {null, null, null, null, null}};
        assertArrayEquals(expected3, ijapa.getSketchpad());

    }

    @Test
    public void testThatIjapaCannotMarkOnBoard_WhenPenIsUp_WhileMoving_North() throws TurtleCanFallOffTheCliffExcption {
        //given that i have a turtle, a sketchpad
        String[][] board = new String[5][5];
        Sketchpad sketchpad = new Sketchpad(board);
        String[][] board2 = ijapa.getSketchpad();
        //when i move on the skechpad
        ijapa.penDown();
        ijapa.turnRight();
        ijapa.move(4);
        String[][] expected4 = {{"-", null, null, null, null},
                                {"-", null, null, null, null},
                                {"-", null, null, null, null},
                                {"-", null, null, null, null},
                                {null, null, null, null, null}};
        assertEquals(Direction.SOUTH, ijapa.getCurrentDirection());
        assertArrayEquals(expected4, ijapa.getSketchpad());

        ijapa.turnLeft();
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());

        ijapa.move(4);
        String[][] expected = {{"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {"-", "-", "-", "-", null}, {null, null, null, null, null}};
        assertArrayEquals(expected, ijapa.getSketchpad());
        ijapa.turnLeft();
        ijapa.penUp();
        ijapa.move(2);
        String[][] expected2 = {{"-", null, null, null, null}, {"-", null, null, null, null}, {"-", null, null, null, null}, {"-", "-", "-", "-", null}, {null, null, null, null, null}};
        ijapa.print();
        assertArrayEquals(expected2, ijapa.getSketchpad());
    }

    @Test
    public void testThatwhenTurtleIsAtTheEdgesOfBoard_TurtleDoesntMove_AnExceptionIsThrown() throws TurtleCanFallOffTheCliffExcption{
        //given that i have a turtle and board and turtle is at point 0,0
        //turtle has a pen and pen is down
        //turtle turns left and faces north
        ijapa.turnLeft();
        //when turtle moves
        try {
            ijapa.move(2);
        }catch (TurtleCanFallOffTheCliffExcption e){
            assertEquals(TurtleCanFallOffTheCliffExcption.class, e.getClass());
        }
        //check that turtle cannot move
//        assertThrows(TurtleCanFallOffTheCliffExcption.class, ()-> ijapa.move(2));
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}