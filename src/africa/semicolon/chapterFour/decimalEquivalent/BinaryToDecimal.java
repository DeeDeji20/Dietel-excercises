package africa.semicolon.chapterFour.decimalEquivalent;

import java.util.Scanner;
/*
* Prompt user to enter the binary integer
* Seperate the integer into its individual unit
*   to sepertate the digit use the remainder and division method
*   the logic is such that it sepertes numbers from right to left
*   declare a base set to 10, sum and counter set to 0
*
* each digit * 2^position
* Add each conversion to total
* */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a binary number: ");
        int binaryDigit = scan.nextInt();

        String convertedStringNumber = String.valueOf(binaryDigit);
        int lengthOfString = convertedStringNumber.length();

        int base =10;
        int counter =0;
        int sum=0;
        while (counter < lengthOfString){
           double value= binaryDigit%(Math.pow(base, counter+1))/ (Math.pow(base, counter));
           int conversionToInt = (int) value;
            System.out.println(conversionToInt);

           if(conversionToInt ==0 || conversionToInt==1){
               sum+= conversionToInt * Math.pow(2, counter);
           }else {
               System.out.println("Not a binary");
           }
            counter++;
        }
        System.out.println(sum);
    }
}
