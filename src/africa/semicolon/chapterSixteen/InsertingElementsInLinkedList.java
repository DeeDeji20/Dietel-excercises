package africa.semicolon.chapterSixteen;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;

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

        System.out.println(list);
    }
}
