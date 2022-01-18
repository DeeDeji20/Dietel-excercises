package africa.semicolon.chapterSeven.pixelQuantization;

public class PixelQuantization {
//    private final int[] pixelValues = new int[10];
    private final int[] pixelValues = {23, 67, 90, 150, 45, 120, 43, 80, 200, 143};
    public void displayPixelQuantization() {
        for (int pixel : pixelValues) {
            if (pixel >= 0 && pixel <= 20) pixel = 10;
            if (pixel >= 21 && pixel <= 40) pixel = 30;
            if (pixel >= 41 && pixel <= 60) pixel = 50;
            if (pixel >= 61 && pixel <= 80) pixel = 70;
            if (pixel >= 81 && pixel <= 100) pixel = 90;
            if (pixel >= 101 && pixel <= 120) pixel = 110;
            if (pixel >= 121 && pixel <= 140) pixel = 130;
            if (pixel >= 161 && pixel <= 180) pixel = 170;
            if (pixel > 180) pixel = 190;
            System.out.print(pixel + " ");
        }
    }

    private void updatePixelQuantization(){

    }
}
