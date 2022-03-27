package africa.semicolon.chapterFourteen;

public class TokenizingNumbers {
    public static void main(String[] args) {
        tokenizeNumber("(333) 555-5555");
    }

    private static void tokenizeNumber(String phoneNumber) {
        StringBuilder builder = new StringBuilder();
        String[] numberArray = phoneNumber.split(" ");
        String numberCode = numberArray[0].substring(1, 4);
        builder.append(numberCode).append("-");
        String[] numberToken =numberArray[1].split("-");
        for (String s : numberToken) {
            builder.append(s);
        }
        System.out.println(builder);
    }
}
