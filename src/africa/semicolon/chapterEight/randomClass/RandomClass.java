package africa.semicolon.chapterEight.randomClass;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for (int i = 0; i < 50; i++) {
            int randomVal = random.nextInt(100);
            System.out.println(randomVal);
        }
    }
}
