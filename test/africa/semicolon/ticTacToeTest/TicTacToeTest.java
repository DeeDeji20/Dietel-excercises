package africa.semicolon.ticTacToeTest;

import africa.semicolon.ticTacToe.GameCharacter;
import africa.semicolon.ticTacToe.Player;
import africa.semicolon.ticTacToe.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    TicTacToe ticTacToe;
    @BeforeEach
    void setUp(){
        //given that game exist
        ticTacToe= new TicTacToe();
    }
    @Test
    void testThatTicTacToeBoardExists(){
        //when i try to get the board
        //check that there is a board entity
        assertNotNull(ticTacToe.getBoard());
    }

    @Test
    void testThatBoardIsA3x3MultidimensionalArray(){
       //assert that the board in the game is a 3x3 array
        GameCharacter[][] board = ticTacToe.getBoard();
        for (GameCharacter[] row: board) {
            //assert that board has 3 rows
            assertEquals(3, board.length);
            //assert that bord has 3 columns
            assertEquals(3, row.length);
        }
    }
    @Test
    void testThatBoardHasEmptyCells(){
        //when i check the boars
        GameCharacter[][] board = ticTacToe.getBoard();
        //assert that the cells are empty
        for (GameCharacter[] row: board) {
            for (GameCharacter character: row) {
                assertEquals(GameCharacter.EMPTY, character);
            }
        }
    }

    @Test
    void testThatGameHasTwoPlayers(){
        //given that i have a game
        //when i start the game
        //assert that there are only 2 players in the game
        assertEquals(2, ticTacToe.getPlayers().length);
    }

    @Test
    void testThatPlayerOneCanMarkOnTheBoard() {
        //given that there is a game
        //there are two players in the game
        Player player = ticTacToe.getPlayers()[0];
        //assert that player is playerone
        assertEquals(1, player.getId());
        //assert that when player one marks on the board, he marks an X
        GameCharacter[][] board = ticTacToe.getBoard();
        ticTacToe.markOnBoard(player,3);
        assertEquals(GameCharacter.X, board[0][2]);

    }

    @Test
    void testThatPlayerTwoCanMarkOnTheBoard() {
        //given that there is a game and board
        //there are two players
        Player player = ticTacToe.getPlayers()[1];
        //asser that player is player 2
        assertEquals(2, player.getId());
        //check that when player 2 marks on the board , he marks an O
        GameCharacter[][] board = ticTacToe.getBoard();
        ticTacToe.markOnBoard(player, 3);
        assertEquals(GameCharacter.O, board[0][2]);
    }
}
