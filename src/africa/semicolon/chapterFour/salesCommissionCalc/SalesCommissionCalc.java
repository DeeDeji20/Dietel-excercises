package africa.semicolon.chapterFour.salesCommissionCalc;

import java.util.Scanner;

public class SalesCommissionCalc {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the items sold between 1 and 4 and negative value to exit");
        int userInput = scanner.nextInt();
        int salary = 200;
        double totalValue = 0.0;
        double price = 0;

        while(userInput > 0 && userInput < 5){
//            if (userInput == 1){
//                price = 239.99;
//            }else if (userInput == 2){
//                price = 129.75;
//            }else if (userInput == 3){
//                price = 99.95;
//            }else if (userInput == 4){
//                price = 350.89;
//            }
            switch (userInput){
                case 1 -> price = 239.99;
                case 2 -> price = 129.75;
                case 3 -> price = 99.95;
                case 4 -> price = 350.89;
            }
            totalValue += price;
            System.out.println("Enter the items sold between 1 nand 4 and negative value to exit");
            userInput = scanner.nextInt();
        }



        double totalSalary = salary + (0.09 * totalValue);
        System.out.println(totalSalary);
    }
//   private final int SALARY = 200;
//   private final double COMMISSION = 0.09;
//   private double price;
//   private double totalSalary;
//
//   public void itemNumber(int userInput){
//       if (userInput > 4){
//           throw new IllegalArgumentException();
//       }
//        switch (userInput){
//            case 1 -> price += 239.99;
//            case 2 -> price += 129.75;
//            case 3 -> price += 99.95;
//            case 4 -> price += 350.89;
//        }
//   }
//
//    public double calculateSalesPersonEarnings(){
//       totalSalary = SALARY + (0.09 * price);
//       return totalSalary;
//   }

}


