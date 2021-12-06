package africa.semicolon.handsOn;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        boolean prime= displayIfPrime();
        System.out.println(prime);
    }
    public static int checkFactors(int number){
        int numberOfFactors=0;
        for(int factor =1; factor < number; factor++){
            if (number%factor ==0){
                System.out.println(factor);
                numberOfFactors++;
            }
        }
        return numberOfFactors;
    }

    public static boolean displayIfPrime(){
        boolean isPrime = false;
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int factors = checkFactors(number);
        System.out.println(factors);
        if(factors <= 2){
            isPrime = true;
        }
        return isPrime;
    }
}
