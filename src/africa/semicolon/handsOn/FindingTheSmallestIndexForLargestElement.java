package africa.semicolon.handsOn;

public class FindingTheSmallestIndexForLargestElement {
    public static void main(String[] args) {
        int[] myArray = {1,5,3,4,5,5};
        int max = myArray[0];
        int secondDuplicate = myArray[0];
        int i;
        int indexOfMax =0;
        int indexOfDuplicate =0;
        for ( i = 0; i < myArray.length; i++) {
            if (myArray[i] > max){
                max = myArray[i];
                indexOfMax = i;
            }
            if (myArray[i] == max){
                secondDuplicate = myArray[i];
                indexOfDuplicate = i;
                int[] secondArray= new int[3];
//                `for (int k = 0; k < secondArray.length; k++) {
//                    secondArray[k] = myArray[i];
//                }
//                for (int j : secondArray) {
//                    System.out.println(secondArray[j] + " ");
//                }`
            }
        }
        System.out.println("The maximum value is "+max+", with an index of "+ indexOfMax);
//        System.out.println("The minimum value is "+secondDuplicate+", with an index of "+indexOfDuplicate);
    }
}
