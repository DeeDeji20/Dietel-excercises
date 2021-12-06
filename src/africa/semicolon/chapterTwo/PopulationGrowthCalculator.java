package africa.semicolon.chapterTwo;

import java.util.Scanner;

public class PopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current world population");
        long currentWorldPopulation= scan.nextLong();
        System.out.println("Enter the population growth rate e.g 1 or 2%");
        int growthRate= scan.nextInt();
        double quotient = (double)growthRate/100;
        double remainder = growthRate%100;
        double percentageGrowth= (quotient + remainder)/100;

        for(int i=0; i<5; i++) {
            currentWorldPopulation += percentageGrowth * currentWorldPopulation;
            System.out.printf("The world population at year %d is %d%n", (i + 1), currentWorldPopulation);
        }
    }
}
