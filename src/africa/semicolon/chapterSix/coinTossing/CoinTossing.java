package africa.semicolon.chapterSix.coinTossing;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    Scanner scan = new Scanner(System.in);

    private int headCount =0;
    private int tailCount =0;
    public Status checkSides(int side) {
        if (side == 1){
            headCount++;
            return Status.HEAD;
        }
        else{
            tailCount++;
            return Status.TAIL;
        }
    }

    public int tossCoin() {
        SecureRandom random = new SecureRandom();
        return 1+ random.nextInt(2);
    }

    public int promptUser(String message) {
        System.out.println(message);
        return scan.nextInt();
    }
    public int getHeadCount(){
        return headCount;
    }
    public int getTailCount(){
        return tailCount;
    }
}
