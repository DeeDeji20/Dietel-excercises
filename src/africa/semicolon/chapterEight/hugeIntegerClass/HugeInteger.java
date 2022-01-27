package africa.semicolon.chapterEight.hugeIntegerClass;

public class HugeInteger {
    int[] integers = new int[40];
    public void parse(String digit){
        for (int i = 0; i < digit.length(); i++) {
            System.out.println(digit.charAt(i));
            integers[i] = digit.charAt(i);
        }
    }
}
