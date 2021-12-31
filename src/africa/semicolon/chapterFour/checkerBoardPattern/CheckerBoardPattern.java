package africa.semicolon.chapterFour.checkerBoardPattern;

public class CheckerBoardPattern {
    public static void main(String[] args) {
//        for(int i =0; i< 8; i++){
//            for(int j =0; j< 8; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//            if (i%2==0){
//                System.out.print(" ");
//            }
//        }

        int count =0;
        while (count < 8){
            int count2 =0;
            while (count2 < 8){
                System.out.print("* ");
                count2++;
            }
            System.out.println();
            count++;
            if (count % 2 ==0){
                System.out.print(" ");
            }
        }
    }
}
