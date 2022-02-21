package africa.semicolon.chapterSeven.turtleGraphics;

import javax.swing.text.Position;
import java.util.Objects;

public class APosition {
    private int row;
    private int column;

    public APosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return "APosition{" +
                "row=" + row +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof APosition)) return false;
        //converting the object to position
        APosition aPosition = (APosition) o;
        return row == aPosition.row && column == aPosition.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    public int getColumn() {
        return column;
    }
    public void setColumn(int column){
        this.column = column;
    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
}
