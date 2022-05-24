package africa.semicolon.handsOnExercises;

public class SecondHighestInArray {
    public static void main(String[] args) {
        int[] intArray =  {2, 45, 12, 56, 23};

        for (int i = 0; i <intArray.length; i++){
            int temp = intArray[0];
            if (intArray[i] > temp){
                temp = intArray[i];
            System.out.println(temp);
            }
        }
    }
}
