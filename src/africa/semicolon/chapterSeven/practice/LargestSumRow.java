package africa.semicolon.chapterSeven.practice;

public class LargestSumRow {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 5}, {3, 6, 9}, {1, 5, 7}};
        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int i = 0; i < array[0].length; i++) {
            maxRow += array[0][i];
        }
        for (int i = 0; i < array.length; i++) {
            int totalOfThisRow =0;
            for (int j = 0; j < array[i].length; j++) {
                totalOfThisRow = array[i][j];

                if (totalOfThisRow > maxRow){
                    maxRow = totalOfThisRow;
                    indexOfMaxRow = i;
                }
            }
        }
            System.out.println(indexOfMaxRow);
    }
}
