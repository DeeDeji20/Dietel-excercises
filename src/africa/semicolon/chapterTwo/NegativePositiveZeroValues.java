package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a digit");
        int value1= input.nextInt();

        System.out.println("Enter a digit");
        int value2= input.nextInt();

        System.out.println("Enter a digit");
        int value3= input.nextInt();

        System.out.println("Enter a digit");
        int value4= input.nextInt();

        System.out.println("Enter a digit");
        int value5= input.nextInt();


        if(value1<0){
            System.out.printf("%d is negative%n", value1);
        }
        if(value1>0){
            System.out.printf("%d is positive%n", value1);
        }
        if(value1==0){
            System.out.printf("%d is a zero value%n", value1);
        }
        if(value2<0){
            System.out.printf("%d is negative%n", value2);
        }
        if(value2>0){
            System.out.printf("%d is positive%n", value2);
        }
        if(value2==0){
            System.out.printf("%d is a zero value%n", value2);
        }
        if(value3<0){
            System.out.printf("%d is negative%n", value3);
        }
        if(value3>0){
            System.out.printf("%d is positive%n", value3);
        }
        if(value3==0){
            System.out.printf("%d is a zero value%n", value3);
        }
        if(value4<0){
            System.out.printf("%d is negative%n", value4);
        }
        if(value4>0){
            System.out.printf("%d is positive%n", value4);
        }
        if(value4==0){
            System.out.printf("%d is a zero value%n", value4);
        }
        if(value5<0){
            System.out.printf("%d is negative%n", value5);
        }
        if(value5>0){
            System.out.printf("%d is positive%n", value5);
        }
        if(value5==0){
            System.out.printf("%d is a zero value%n", value5);
        }
    }
}
