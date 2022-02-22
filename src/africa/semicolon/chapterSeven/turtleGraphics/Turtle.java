package africa.semicolon.chapterSeven.turtleGraphics;

//import javax.swing.text.Position;
import java.util.Arrays;

public class Turtle {
    private final Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
    private final APosition currentPosition = new APosition(0, 0);
    private final String[][] sketchpad = new String[5][5];
    private final Sketchpad sketch = new Sketchpad(sketchpad);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setState(PenState.DOWN);
    }

    public void penUp() {
        pen.setState(PenState.UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {

        if (currentDirection == Direction.EAST) face(Direction.SOUTH);
        else if (currentDirection == Direction.WEST) face(Direction.NORTH);
        else if (currentDirection == Direction.SOUTH) face(Direction.WEST);
        else if (currentDirection == Direction.NORTH) face(Direction.EAST);


    }

    private void face(Direction direction) {
        currentDirection = direction;
    }

    public void turnLeft() {
        if (currentDirection == Direction.EAST) face(Direction.NORTH);
        else if (currentDirection == Direction.NORTH) face(Direction.WEST);
        else if (currentDirection == Direction.WEST) face(Direction.SOUTH);
        else if (currentDirection == Direction.SOUTH) face(Direction.EAST);
    }

    public void move(int steps) throws TurtleCanFallOffTheCliffExcption {
        validateMove(steps);
//        if (currentDirection == Direction.NORTH
//                && pen.getStatus().equals(PenState.DOWN)
//                && (currentPosition.getColumn() == 0 && currentPosition.getRow() == 0)) throw new TurtleCanFallOffTheCliffExcption("You will fall off the cliff");

        if (currentDirection == Direction.EAST && pen.getStatus().equals(PenState.DOWN)) increaseColumn(steps -1);
        if (currentDirection == Direction.SOUTH && pen.getStatus().equals(PenState.DOWN)) increaseRow(steps -1);
        if (currentDirection == Direction.WEST && pen.getStatus().equals(PenState.DOWN)) decreaseColumn(steps -1);
        if (currentDirection == Direction.NORTH && pen.getStatus().equals(PenState.DOWN)) decreaseRow(steps -1);
    }

    private void validateMove(int steps) throws TurtleCanFallOffTheCliffExcption {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        switch(currentDirection){
            case EAST, WEST -> {
                if (row + steps > sketch.getBoard()[row].length) throw new TurtleCanFallOffTheCliffExcption("You go fall");
            }
            case NORTH, SOUTH -> {
                if (column + steps > sketch.getBoard()[column].length) throw new TurtleCanFallOffTheCliffExcption("You go fall");
            }
        }
    }

    private void decreaseRow(int decrease) {
        for (int i = currentPosition.getRow(); i >= 0; i--) {
            for (int j = currentPosition.getColumn(); j <= currentPosition.getColumn(); j++) {
//                System.out.println(i + " "+ j);
//                sketchpad[i][j] = "-";
                sketch.getBoard()[i][j] = "-";
            }
        }
//        sketch.display();
        currentPosition.setRow(currentPosition.getRow() - decrease);
    }

    private void decreaseColumn(int decrease) {
        System.out.println(currentPosition.getRow());
        System.out.println(currentPosition.getColumn());
        System.out.println(decrease);
        for (int i = currentPosition.getRow(); i < currentPosition.getRow()+1; i++) {
            for (int j = currentPosition.getColumn(); j >= 0; j--) {
                System.out.println(i + " " + j);
//                sketchpad[i][j] = "-";
                sketch.getBoard()[i][j] = "-";
            }
            System.out.println(Arrays.deepToString(sketchpad));
        }
        currentPosition.setColumn(currentPosition.getColumn() - decrease);
    }

    private void increaseRow(int increase) {
        for (int i =currentPosition.getRow(); i <= increase; i++){
            for (int j = currentPosition.getColumn(); j <= currentPosition.getColumn(); j++) {
//                sketchpad[i][j] = "-";
                sketch.getBoard()[i][j] = "-";
            }
        }
        currentPosition.setRow(currentPosition.getRow() + increase);
    }

    private void increaseColumn(int increase) {
//        System.out.println(currentPosition.getRow() + " " + currentPosition.getColumn());
        for (int i = currentPosition.getRow(); i < currentPosition.getRow()+1; i++){
            for (int j = currentPosition.getColumn(); j <= increase; j++){
//                sketchpad[i][j] = "-";
                sketch.getBoard()[i][j]  ="-";
            }
        }
        currentPosition.setColumn(currentPosition.getColumn() + increase);
    }

    public APosition getCurrentPosition() {
        return currentPosition;
    }

    public String[][] getSketchpad() {
        return sketchpad;
    }
}
