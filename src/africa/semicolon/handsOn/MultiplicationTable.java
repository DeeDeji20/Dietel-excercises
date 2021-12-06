package africa.semicolon.handsOn;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.print(" ".repeat(8));
        for (int i =1; i<=12; i++){
            System.out.print(i +" ".repeat(4));
        }
        System.out.println();
        System.out.println("-".repeat(70));

        for (int j =1; j<=12; j++){
            System.out.print(j + " | ");
            for (int k =1; k<=12; k++){
                System.out.printf("%5d", j*k);
            }
            System.out.println();
        }
    }
}
