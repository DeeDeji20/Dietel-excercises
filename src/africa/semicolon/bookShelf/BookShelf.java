package africa.semicolon.bookShelf;


import java.util.*;

public class BookShelf {
    private final List<String> books = new ArrayList<>();
    public List<String> books() {
        return Collections.unmodifiableList(books);
    }

    public void add(String... bookToAdd) {
//        books.add(bookToAdd);
        Arrays.stream(bookToAdd).forEach(book -> books.add(book));
    }

    public List<String> arrange() {
        books.sort(Comparator.naturalOrder());
        return books;
    }
}
