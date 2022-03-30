package africa.semicolon.chapterSixteen;

import java.util.*;



public class TestT {
    public static void main(String[] args) {
        Collection<Integer> collection =new ArrayList<Integer>();


        collection.add(Integer.valueOf("5"));
//        System.out.println(collection);
        Map<String, Integer> map = new HashMap<String, Integer>();

        List <Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(6);
        list2.add(8);
        Iterator<Integer> it = list2.iterator();
        ListIterator<Integer> it2 = list2.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
