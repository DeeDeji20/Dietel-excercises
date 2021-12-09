package arrayOfNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfNumbersTest {
    @Test
    public  void arrayTootalCanBeCalculated(){
        //given that i have an array of numbers
        int[] numbers = {1,2,3,4,5};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the total
        int total = ArrayOfNumbers.calculateTotalOf(numbers);
        //check that total is equal to actual
        assertEquals(15, total);
    }

    @Test
    public  void arrayMinimumCanBeCalculated(){
        //given that i have an array of numbers
        int[] numbers = {1,2,3,4,5};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the total
        int min = ArrayOfNumbers.calculateMinimumOf(numbers);
        //check that total is equal to actual
        assertEquals(1, min);
    }

    @Test
    public  void arrayMaximumCanBeCalculated(){
        //given that i have an array of numbers
        int[] numbers = {1,2,3,4,5};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the total
        int max = ArrayOfNumbers.calculateMinOf(numbers);
        //check that total is equal to actual
        assertEquals(5, max);
    }

    @Test
    public  void arrayAverageCanBeCalculated(){
        //given that i have an array of numbers
        int[] numbers = {1,2,3,4,5};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the average
        double average = ArrayOfNumbers.calculateAverageOf(numbers);
        //check that total is equal to actual
        assertEquals(3.0, average);
    }

    @Test
    public  void arraySumOfNumberMinusMinimumCanBeCalculated(){
        //given that i have an array of numbers
        int[] numbers = {1,2,3,4,5};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the total - minimumNumber
        int totalMinusOne = ArrayOfNumbers.calculateTotalMinusMini(numbers);
        //check that total is equal to actual
        assertEquals(14, totalMinusOne);
    }

    @Test
    public  void arraySumOfNumberMinusMaximumCanBeCalculated() {
        //given that i have an array of numbers
        int[] numbers = {7, 10, 14, 18, 2};
        ArrayOfNumbers myArray = new ArrayOfNumbers();
        //when i calculate the total - maxNumber
        int totalMinusOne = ArrayOfNumbers.calculateTotalMinusMaxim(numbers);
        //check that total is equal to actual
        assertEquals(33, totalMinusOne);
    }
}
