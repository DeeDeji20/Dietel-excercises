package africa.semicolon.chapterSixteen;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        List<String> list = new ArrayList<String>();
        for (String color : colors) {
            list.add(color);
        }

        String[] colorsToRemove = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String color : colorsToRemove) {
            removeList.add(color);
        }
        System.out.println("ArrayLait: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        removeColors(list, removeList);
        System.out.println("After removing selected colors...");
        for (String color: list) {
            System.out.println(color);
        }
    }

    private static void removeColors(Collection<String> list, Collection<String> colorsToRemove) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (colorsToRemove.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
