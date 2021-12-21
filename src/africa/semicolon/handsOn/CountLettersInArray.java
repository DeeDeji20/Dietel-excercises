package africa.semicolon.handsOn;

public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("The lower case letters are:");
        displayArrays(chars);

        //count the occurrence of each letter
        int[] counts = countLetter(chars);
        //to display the counts
//        displayCounts(counts);
    }

    private static void displayCounts(int[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }

    private static int[] countLetter(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
            return counts;
    }

    private static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomCharacter();
        }
        return chars;
    }

    private static char getRandomCharacter() {
        return (char)('a' + Math.random() * ('a' - 'z' + 1));
    }

    private static void displayArrays(char[] chars) {
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
    }
}
