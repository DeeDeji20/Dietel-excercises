package africa.semicolon.chapterSix.squareOfAnyCharacter;

public class SquareOfAnyCharacter {
    private int count;

    public void squareOfAnyCharacter(int sides, char fillCharacter) {
        for (int i = 0; i < sides; i++) {
            for (int j = 0; j < sides; j++) {
                System.out.print(fillCharacter);
                count++;
            }
            System.out.println();
        }
    }

    public int getCount() {
        return count;
    }
}
