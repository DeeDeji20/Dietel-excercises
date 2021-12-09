package arrayOfNumbers;

public class ArrayOfNumbers {

    public static int calculateTotalOf(int[] numbers) {
        int total =0;
        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];
        }
        return total;
    }

    public static int calculateMinimumOf(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min) min = numbers[i];
        }
        return min;
    }

    public static int calculateMinOf(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) max = numbers[i];
        }
        return  max;
    }

    public static double calculateAverageOf(int[] numbers) {
        double sum =0.0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];
        }
        double average = (double) sum/numbers.length;
        return average;
    }

//    public static int calculateTotalMinusMini(int[] numbers){
//        int total =0;
//        int min =numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            total+= numbers[i];
//            min = Math.min(min, numbers[i]);
//        }
//        int totalMinusMin = total - min ;
//        return totalMinusMin;
//    }

//    public static int calculateTotalMinusMax(int[] numbers) {
//        int total =0;
//        int max =numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            total+= numbers[i];
//            max = Math.max(max, numbers[i]);
//        }
//        int totalMinusMax = total - max ;
//        return totalMinusMax;
//    }
     public static int calculateTotalMinusMini(int[] numbers){
         int total =0;
         int max =numbers[0];
         int totalMax=Integer.MIN_VALUE;
        for (int number : numbers) {
            total += number;
        }
         for (int number : numbers) {
             max = number;
             if (total - max > totalMax) totalMax = total - max;
         }
         return totalMax;
     }
    public static int calculateTotalMinusMaxim(int[] numbers) {
        int total =0;
        int max =numbers[0];
        int totalMax=Integer.MAX_VALUE;
        for (int number : numbers) {
            total += number;
        }
        for (int number : numbers) {
            max = number;
            if (total - max < totalMax) totalMax = total - max;
        }
        return totalMax;
    }
}
