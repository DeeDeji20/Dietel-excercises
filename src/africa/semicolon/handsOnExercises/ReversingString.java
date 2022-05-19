package africa.semicolon.handsOnExercises;

public class ReversingString {
    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
