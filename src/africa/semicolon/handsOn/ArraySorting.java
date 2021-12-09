package africa.semicolon.handsOn;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 3};
        int[] array2 = {5, 1, 4, 2, 3};

//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
        sortingArrayInAscending(array2);
        sortingArrayInDescending(array);
    }

    private static void sortingArrayInDescending(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j]> array[i]){
                    temp =array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void sortingArrayInAscending(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = i+1; j < array2.length; j++) {
                if (array2[j] < array2[i]){
                    int temp = array2[i];
                    array2[i]=array2[j];
                    array2[j] = temp;
                }
            }
        }
        for (int j : array2) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
