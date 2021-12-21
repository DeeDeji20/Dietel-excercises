package africa.semicolon.handsOn;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'X', 'X', 'X', }, {'O', 'X', 'O'}};
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length ; j++) {
                System.out.print(ticTacToe[i][j] +" ");
            }
            System.out.println();
        }

//        {{{}, {}}, {{},{}}}


    }
}
