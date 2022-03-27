package africa.semicolon.chapterFourteen;

public class FormingBallon {
    public static void main(String[] args) {
        formingBallon("labollonsrtaj");
    }

    private static void formingBallon(String text) {
        StringBuilder sb = new StringBuilder();
        String word = "balloon";
        String[] charArray = text.split("");

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < word.length(); j++) {

            }
        }
        System.out.println(sb);
    }
}
