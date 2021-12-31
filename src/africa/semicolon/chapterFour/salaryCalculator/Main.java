//package africa.semicolon.chapterFour.salaryCalculator;
//
//import africa.semicolon.chapterFour.salesCommissionCalc.SalesCommissionCalc;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        SalesCommissionCalc salesCommissionCalc = new SalesCommissionCalc();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the item number sold");
//
//        int userInput = scan.nextInt();
//
//            try {
//                while (userInput >0){
//                    salesCommissionCalc.itemNumber(userInput);
//                    System.out.println("Enter the item number sold");
//                    userInput = scan.nextInt();
//                }
//            } catch (IllegalArgumentException e){
//                System.out.println("Invalid input");
//            }
//
//        System.out.println(salesCommissionCalc.calculateSalesPersonEarnings());
//
//    }
//}
