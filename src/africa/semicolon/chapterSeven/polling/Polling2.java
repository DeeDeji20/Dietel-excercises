package africa.semicolon.chapterSeven.polling;

public class Polling2 {
    private final String[] topics = {"politics", "gender", "food", "entertainment", "love"};
    private static int[][] responses = new int[5][10];

    public String[] getTopics() {
        return topics;
    }

    public void getResponses() {
        for (int i = 0; i < responses.length; i++) {
            System.out.printf("%-14s ", topics[i]);
            for (int j = 0; j < responses[i].length; j++) {
                System.out.print(responses[i][j] + " ");
            }
            System.out.println();
        }
    }
}
