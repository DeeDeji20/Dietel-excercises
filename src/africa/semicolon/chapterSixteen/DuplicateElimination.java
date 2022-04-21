package africa.semicolon.chapterSixteen;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElimination {
    private static final Set<String> set = new HashSet<>();

    public static void processInformation(String[] list) {
        for (String str : list) {
            set.add(str);
        }

    }

    public static int getSize() {
       return set.size();
    }

    public static void getUser(String user) {
    }
}
