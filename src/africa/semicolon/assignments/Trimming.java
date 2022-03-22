package africa.semicolon.assignments;

public class Trimming {
    public static void main(String[] args) {
        trimString("   chair    man    ");
    }

    private static void trimString(String word) {
        String newString = word.trim();
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i <newString.length(); i++){
            if (newString.charAt(i) != ' '){
                letter.append(newString.charAt(i));
            }
        }
        System.out.println(letter);
    }

}
