package africa.semicolon.chapterSeven.turtleGraphics;

public class Sketchpad {
    private final String[][] board;

    public Sketchpad(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }
    public void display(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
