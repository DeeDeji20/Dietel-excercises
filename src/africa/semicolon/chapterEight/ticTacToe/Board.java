package africa.semicolon.chapterEight.ticTacToe;

import africa.semicolon.ticTacToe.GameCharacter;

public class Board {
    private Cell[][] gameBoard = new Cell[3][3];

    public Board() {
        for (Cell[] cells:gameBoard) {
            for (Cell cell : cells) {
                cell = Cell.EMPTY;
            }
        }
    }
}
