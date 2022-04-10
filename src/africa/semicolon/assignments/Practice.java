package africa.semicolon.assignments;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        getIndexOfS("Mississipi");
    }

    private static void getIndexOfS(String word) {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 's'){
               arr.add(i);
            }
        }
        System.out.println(arr);
    }
}
