package africa.semicolon.ticTacToe;

import java.util.Arrays;

public class TicTacToe {
    private final GameCharacter[][] board = new GameCharacter[3][3];
    private final Player[] players;

    public TicTacToe() {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], GameCharacter.EMPTY);
        }
        players = new Player[2];
        for (int i = 0; i < players.length; i++) {
            players[i]=new Player();
            players[i].setId(i+1);
        }
    }

    public GameCharacter[][] getBoard() {
        return board;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void markOnBoard(Player player, int cell) {
        player.markBoard(board, cell);
    }
}
