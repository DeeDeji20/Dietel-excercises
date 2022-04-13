package africa.semicolon.chapterSixteen;

import java.security.SecureRandom;
import java.util.*;

public class InsertingElementsInLinkedList {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        List<Integer> list = new LinkedList<>();
//        System.out.println(random.ints(25, 0, 100).sorted().sum());
//        OptionalDouble opt = random.ints(25, 0, 100).sorted().average();
//        System.out.println(opt);

        for (int i = 0; i < 25; i++) {
           int number = random.nextInt(100);
           list.add(number);
           list.sort(Comparator.naturalOrder());
        }

        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("green");
        list1.add("blue");
        List<String> list2 = new ArrayList<>();
        list2.add("red");
        list2.add("orange");
        list2.add("pink");

        System.out.println(list2);
//        System.out.println(list);
    }
}

