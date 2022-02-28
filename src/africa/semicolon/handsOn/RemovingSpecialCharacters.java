package africa.semicolon.handsOn;


import java.util.Arrays;

public class RemovingSpecialCharacters {
    public static void main(String[] args) {
        String[] num = "welcome#to_java&cohort%nine".split("[ #_&%$]");
//        String[] num = "welcome#to_java&cohort%nine".replaceAll("[#_&%$]", " ").split("[ #_&%$]");
        System.out.println(Arrays.toString(num));

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals(num[0])){
                String first =num[0].replaceFirst("[A-Z]", "[a-z]");
                builder.append(first);
                continue;
            }
            String ch = ""+num[i].toUpperCase().charAt(0);
             String each = num[i].replaceFirst("[a-z]", ch);
            builder.append(each);
        }
        System.out.println(builder);
    }
}
