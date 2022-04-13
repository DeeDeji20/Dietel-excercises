package africa.semicolon.algo;

public class ConsecutiveOnes {
    boolean isConsecutive = false;
    public boolean solution(int[] numbers) {
        for (int i = 0; i <numbers.length; i++){

            if(numbers[i] == 1){
                isConsecutive = true;
            }
            else if (numbers[i] != 1 && isConsecutive){
                break;
            }
        }
        return isConsecutive;

    }
    /*
    * You are given a list of integers nums which contains at least one 1.
    * Return whether all the 1s appear consecutively.*/

}
