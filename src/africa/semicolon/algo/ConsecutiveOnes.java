package africa.semicolon.algo;

public class ConsecutiveOnes {
    public boolean solution(int[] numbers) {
        for (int i = 0; i <numbers.length; i++){
            int num1 = i;
            int num2 = i + 1;

            if (num1 == 1 && num2 == 1){
                break;
            }
                return true;

        }
        return false;
    }
    /*
    * You are given a list of integers nums which contains at least one 1.
    * Return whether all the 1s appear consecutively.*/

}
