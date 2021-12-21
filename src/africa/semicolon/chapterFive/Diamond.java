package africa.semicolon.chapterFive;

public class Diamond {
    public static void main(String[] args) {
        int number = 9;
//        for (int x = 0; x< 2; x++){
//            if ( x < 1) {
                for (int i = 0; i < number; i += 2) {
                    for (int k = i; k <= number - 2; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
//            }
//            System.out.println();
//            if (x ==1 ){
                for (int i = number-2; i >0; i -= 2) {
//                    if (i == 1){
//                        System.out.print("  ");
//                    }
                    for (int k = number; k > i; k-=2) {
                        System.out.print(" ");
                    }
                    for (int j = i; j > 0; j--) {

                        System.out.print(" *");
                    }
                    System.out.println();
//                    System.out.print("   ");
                }
            }
//        }
//
//    }
}
