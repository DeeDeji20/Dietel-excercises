package africa.semicolon.ticTacToe;

public class Player {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public  void markBoard(GameCharacter[][] board, int cell){
        if(this.id==1 && cell ==1) board[0][0] = GameCharacter.X;
        if(this.id==1 && cell ==2) board[0][1] = GameCharacter.X;
        if(this.id==1 && cell ==3) board[0][2] = GameCharacter.X;
        if(this.id==1 && cell ==4) board[1][0] = GameCharacter.X;
        if(this.id==1 && cell ==5) board[1][1] = GameCharacter.X;
        if (this.id == 2 && cell== 3) board[0][2] = GameCharacter.O;
    }
}
