package africa.semicolon.chapterFive;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        double price = 0;
        double priceByQty = 1;
        double retailPrice = 0;
        double cummulativeTotal =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product number");
        int productNumber = scanner.nextInt();
        System.out.println("Enter quantity sold");
        int qtySold = scanner.nextInt();

        while (productNumber > 0){
            switch (productNumber){
                case 1 -> price = 2.98;
                case 2 -> price = 4.50;
                case 3 -> price = 9.98;
                case 4 -> price = 4.49;
                case 5 -> price = 6.87;
//            default -> {throw new};
            }
            System.out.println("Enter product number");
            productNumber = scanner.nextInt();
            if (productNumber >0) {
                System.out.println("Enter quantity sold");
                qtySold = scanner.nextInt();
            }
            priceByQty = price * qtySold;
            retailPrice += priceByQty;
            System.out.printf("The retail price for item is: %.2f%n ", retailPrice);
            cummulativeTotal += retailPrice;
        }
        System.out.printf("The total retail value for all item is : %.2f%n", cummulativeTotal);

    }
}
