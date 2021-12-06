package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Input your weight in kg");
        int weight= input.nextInt();

        System.out.println("Input your height in meters");
        double height=input.nextDouble();

        double BMI= weight/(height*height);
        System.out.println(BMI);

        if(BMI< 18.5){
            System.out.println("Underweight");
        }
        if(BMI>=18.5 && BMI <= 24.9){
            System.out.println("Normal weight");
        }
        if(BMI>=25 && BMI<= 29.9){
            System.out.println("Overweight");
        }
        if(BMI >= 30){
            System.out.println("Obese");
        }
    }
}
