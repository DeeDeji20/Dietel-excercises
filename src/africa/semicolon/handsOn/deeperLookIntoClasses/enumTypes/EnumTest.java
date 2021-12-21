package africa.semicolon.handsOn.deeperLookIntoClasses.enumTypes;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All books: ");

        for (Book book : Book.values()){
            System.out.printf("%-10s%-45s%s%n",book, book.getTitle(), book.getCopyrightYear());
        }
    }
}
