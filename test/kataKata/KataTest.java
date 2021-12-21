package kataKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    Kata kata;
    @BeforeEach
    public void startingPoint(){
        kata = new Kata();
    }
    @Test
    public void aGradeCanBeCalculatedTest(){
//        Kata kata = new Kata();
        char result = kata.calculateGradeFor(98);
        assertEquals('A', result);
    }

    @Test
    public void bGradeCanBeCalculatedTest(){

        char result = kata.calculateGradeFor(89);
        assertEquals('B', result);
    }

    @Test
    public void cGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(70);
        assertEquals('C', result);
    }
    @Test
    public void dGradeCanBeCalculatedTest(){
//        Kata kata = new Kata();
        char result = kata.calculateGradeFor(60);
        assertEquals('D', result);
    }

    @Test
    public void fGradeCanBeCalculatedTest(){
//        Kata kata = new Kata();
        char result = kata.calculateGradeFor(59);
        assertEquals('F', result);
    }

    @Test
    public void calculateForLessThanFourCopiesTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(4, 2000);
        assertEquals(8000,price);
    }

    @Test
    public void calculateGreaterThanFiveAndLessThanNineTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(6, 1800);
        assertEquals(10800,price);
    }

    @Test
    public void calculateGreaterThanTenAndLessThanTwentyNineTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(11, 1600);
        assertEquals(17600,price);
    }

    @Test
    public void calculateGreaterThanThirtyAndLessThanFourtyNineTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(30, 1500);
        assertEquals(45000,price);
    }

    @Test
    public void calculateGreaterThanFiftyAndLessThanNinetyNineTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(50, 1300);
        assertEquals(65000,price);
    }

    @Test
    public void calculateGreaterThanHundredAndLessThanOneNinetNineTest(){
//        Kata kata = new Kata();
        int price = kata.calculatePriceFor(100, 1500);
        assertEquals(150000,price);
    }

    @Test
    public void calculateGreaterThanTwoHundredAndLessThanFourNinetNineTest(){
        Kata kata = new Kata();
        int price = kata.calculatePriceFor(200, 1100);
        assertEquals(220000,price);
    }

    @Test
    public void calculateGreaterThanFiveHundredTest(){
        Kata kata = new Kata();
        int price = kata.calculatePriceFor(500, 1000);
        assertEquals(500000,price);
    }

    @Test
    void printMultidimensionalArrayAsTableTest(){
        Kata kata = new Kata();
        int[][] myArray = {{1,2,3,4}, {4,6,7,8}};
        kata.createTableFromArray(myArray);
    }
}
