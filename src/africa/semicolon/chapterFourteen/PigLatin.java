package africa.semicolon.chapterFourteen;

public class PigLatin {
    private StringBuilder stringBuilder = new StringBuilder();
    public void printLatinWord(String word) {
        char firstLetter = word.charAt(0);
        String otherLeters = word.substring(1);
        stringBuilder.append(otherLeters).append(firstLetter).append("ay");
        System.out.println(stringBuilder);
    }

    public String getPigLatin() {
        return stringBuilder.toString();
    }
}
