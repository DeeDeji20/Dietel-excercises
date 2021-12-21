package africa.semicolon.chapterFive;

public class ProductOfOddNumbers {
    public static void main(String[] args) {
        int product = 1;
        for (int index = 1; index <= 15; index++) {
            if (index % 2 != 0) product *= index;
        }
        System.out.println(product);
    }
}
