package africa.semicolon.handsOn;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
//        String value = "Adeola#ufdhj_hfdk%hk$";
//
//        for (int i = 0; i < value.length(); i++) {
//            System.out.println(value.charAt(i));
//        }

        String characters = "Hello there";
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";
        char[] chars = new char[5];
        String number= "440-02-4534";
        String number2= "+234-70-105-105".replace("+234", "0");
        System.out.println(number2);
        System.out.println(number.matches("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println(number2.matches("\\d-\\d{2}-\\d{3}-\\d{3}"));

        characters.getChars(0, 5, chars, 0);
        System.out.println(chars);
        System.out.println(s3.equalsIgnoreCase(s4));



    }
}
