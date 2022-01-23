package africa.semicolon.chapterFour.binaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Binary number");

        int userInput=scan.nextInt();
        String convertUserInput= String.valueOf(userInput);

        int counter=0;
        int base=10;
        int sum=0;
        double binaryStore;

        int inputLength= convertUserInput.length();

        while(counter<inputLength){
            binaryStore= userInput %(Math.pow(base, counter+1))/(Math.pow(base, counter));
            int binaryStoreValue= (int) binaryStore;

            if(binaryStoreValue ==0 || binaryStoreValue==1){
                sum+= binaryStoreValue*(Math.pow(2, counter));
            }else{
                System.out.println("Not a binary digit");
            }
            counter++;
        }

        System.out.println(sum);
    }
}
