package africa.semicolon.chapterSix.squareOfAsterikss;

public class SquareOfAsteriks {
    private int count;

    public void squareOfAsteriks(int sides) {
        for (int i = 0; i < sides; i++) {
            for (int j = 0; j < sides; j++) {
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
    }

    public int getCount() {
        return count;
    }
}
