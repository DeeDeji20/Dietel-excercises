package africa.semicolon.chapterSeven.totalSales;

import java.util.Scanner;

public class TotalSales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] salesInfo = new int[5][5];
        System.out.println(salesInfo.length);
        int salesPersonNumber;
        int price1;
        int price2;
        int price3;
        int price4;
        for (int i = 0; i < salesInfo.length; i++) {
            System.out.println("Enter salesperson number");
            salesPersonNumber = scan.nextInt();
            System.out.println("Enter product1 price");
            price1 = scan.nextInt();
            System.out.println("Enter product2 price");
            price2 = scan.nextInt();
            System.out.println("Enter product3 price");
            price3 = scan.nextInt();
            System.out.println("Enter product4 price");
            price4 = scan.nextInt();

            for (int j = 0; j < salesInfo[i].length; j++) {
                salesInfo[i][0] = salesPersonNumber;
                salesInfo[i][1] = price1;
                salesInfo[i][2] = price2;
                salesInfo[i][3] = price3;
                salesInfo[i][4] = price4;
            }
        }
        displaySalesInfo(salesInfo);
        calulateTotalForsalesPersons(salesInfo);
    }

    private static void calulateTotalForsalesPersons(int[][] salesInfo) {
        System.out.print("\t\t");
        for (int i = 0; i < salesInfo.length; i++) {
            int total =0;
            for (int j = 1; j < salesInfo[i].length; j++) {
                total+= salesInfo[i][j];
            }
            System.out.printf("%d  ", total);
        }
    }

    private static void displaySalesInfo(int[][] salesInfo) {
        String[] salesPerson = {"person1", "person2", "person3", "person4", "person5"};
        for (int i = 0; i < salesInfo.length; i++) {
            for (int j = i; j < i+1; j++) {
                System.out.print(salesPerson[j]+ "\t");
            }
            int sum =0;
            for (int j = 0; j < salesInfo[i].length; j++) {
                sum = salesInfo[j+1][i];
                System.out.printf("%d\t", salesInfo[j][i]);
            }
            System.out.println();
        }
        System.out.println("-".repeat(30));

        //total of the column
//        System.out.print("\t\t");
//        for (int i = 0; i < salesInfo.length; i++) {
//            int total =0;
//            for (int j = 1; j < salesInfo[i].length; j++) {
//                total+= salesInfo[i][j];
//            }
//            System.out.printf("%d  ", total);
//        }
    }
}
