package africa.semicolon.chapterSeven.turtleGraphics;

public class Pen {
    private PenState penState = PenState.UP;
    public PenState getStatus() {
        return penState;
    }

    public void setState(PenState penState) {
        this.penState = penState;
    }
}
