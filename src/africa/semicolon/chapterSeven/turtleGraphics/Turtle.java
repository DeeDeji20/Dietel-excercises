package africa.semicolon.chapterSeven.turtleGraphics;

import java.util.Arrays;

public class Turtle {
    private final Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
    private final APosition currentPosition = new APosition(0, 0);
    private final String[][] board = new String[5][5];
    private final Sketchpad sketch = new Sketchpad(board);

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
        if (currentDirection == Direction.EAST) increaseColumn(steps -1);
        if (currentDirection == Direction.SOUTH) increaseRow(steps -1);
        if (currentDirection == Direction.WEST) decreaseColumn(steps -1);
        if (currentDirection == Direction.NORTH) decreaseRow(steps -1);
    }

    private void validateMove(int steps) throws TurtleCanFallOffTheCliffExcption {
        int row = currentPosition.getRow();
        int column = currentPosition.getColumn();

        switch(currentDirection){
            case EAST -> {
                if (column + steps > sketch.getBoard()[row].length) throw new TurtleCanFallOffTheCliffExcption("You go fall");
            }
            case NORTH -> {
                if (row + steps > sketch.getBoard()[column].length) throw new TurtleCanFallOffTheCliffExcption("You go fall");
            }
            case WEST -> {
                if (column - steps > sketch.getBoard()[row].length) throw new TurtleCanFallOffTheCliffExcption("You go fall");
            }
            case SOUTH -> {
                if (row - steps > sketch.getBoard()[column].length) throw new TurtleCanFallOffTheCliffExcption("You go fail");
            }
        }
    }

    private void decreaseRow(int decrease) {
        if (pen.getStatus().equals(PenState.DOWN)) {
            for (int i = currentPosition.getRow(); i >= 0; i--) {
                for (int j = currentPosition.getColumn(); j <= currentPosition.getColumn(); j++) {
//                System.out.println(i + " "+ j);
//                sketchpad[i][j] = "-";
                    sketch.getBoard()[i][j] = "-";
                }
            }
        }
        currentPosition.setRow(currentPosition.getRow() - decrease);
    }

    private void decreaseColumn(int decrease) {
//        System.out.println(currentPosition.getRow());
//        System.out.println(currentPosition.getColumn());
//        System.out.println(decrease);
        if (pen.getStatus().equals(PenState.DOWN)) {
            for (int i = currentPosition.getRow(); i < currentPosition.getRow() + 1; i++) {
                for (int j = currentPosition.getColumn(); j >= 0; j--) {
                    System.out.println(i + " " + j);
//                sketchpad[i][j] = "-";
                    sketch.getBoard()[i][j] = "-";
                }
//                System.out.println(Arrays.deepToString(board));
            }
        }
        currentPosition.setColumn(currentPosition.getColumn() - decrease);
    }

    private void increaseRow(int increase) {
        if (pen.getStatus().equals(PenState.DOWN)) {
            for (int i = currentPosition.getRow(); i <= increase; i++) {
                for (int j = currentPosition.getColumn(); j <= currentPosition.getColumn(); j++) {
//                sketchpad[i][j] = "-";
                    sketch.getBoard()[i][j] = "-";
                }
            }
        }
        currentPosition.setRow(currentPosition.getRow() + increase);
    }

    private void increaseColumn(int increase) {
//        System.out.println(currentPosition.getRow() + " " + currentPosition.getColumn());
        if (pen.getStatus().equals(PenState.DOWN)) {
            for (int i = currentPosition.getRow(); i < currentPosition.getRow() + 1; i++) {
                for (int j = currentPosition.getColumn(); j <= increase; j++) {
//                sketchpad[i][j] = "-";
                    sketch.getBoard()[i][j] = "-";
                }
            }
        }
        currentPosition.setColumn(currentPosition.getColumn() + increase);
    }

    public APosition getCurrentPosition() {
        return currentPosition;
    }

    public String[][] getBoard() {
        return board;
    }
    public void print(){
        for (int i = 0; i < sketch.getBoard().length; i++) {
            for (int j = 0; j < sketch.getBoard()[i].length; j++) {
                System.out.print(sketch.getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
