package africa.semicolon.bookShelf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("< = BookShelf specification = > ")
public class BookShelfTest {
    private BookShelf shelf;

    @BeforeEach
    void init(){
        shelf = new BookShelf();
    }
    @Test@DisplayName("is empty when no book is added")
    void shelfIsEmptyWhenMoBookIsTheAdded() throws Exception{
        //given that i have a bookshelf
        //when bookshelf doesnt have any books
        List<String> books = shelf.books();
        //assert that bookshelf is empty
        assertTrue(books.isEmpty(), ()->"Bookshelf should be empty");
    }

    @Test
    void shelfToStringShouldPrintBookCountAndTitles() throws Exception{
        //given that i have a book shelf

        //when i add books to the book shelf
        shelf.add("Phoenix", "My new Book");
        List<String> books = shelf.books();

        //assret that i have books in the shelf
        assertEquals(2, books.size(), ()-> "Booksshelf should have two books");

    }

    @Test
    void emptyShelfWhenAdIsCalledWithoutBooks(){
        //given that i have a bookshelf

        //when i add without a book
        shelf.add();
        List<String> books = shelf.books();
        //assert that bookshelf is empty
        assertTrue(books.isEmpty(), ()->"Bookshelf should be empty");
    }

    @Test
    void booksReturnedFromBookShelfIsImmutableForClient(){
        //given that i have a book shelf with books
        shelf.add("Immutable js", "clean coder");

        List<String> books = shelf.books();
        try{
            books.add("The mythical man");
            fail(()-> "Shoul not be able to add book to books");
        }catch(Exception e){
            assertTrue(e instanceof UnsupportedOperationException, ()-> "Should throw unsupported exceptions.");
        }
    }

    @Test
    void bookShelfArrangedByBookTitle(){
        //given that i have a book shelf

        //when i add books in the shelf
        shelf.add("Once upon a time", " a boy lives her", "sweet sensation");
        List<String> books = shelf.arrange();

        //check that books are sorted in the collection
        assertEquals(Arrays.asList(" a boy lives her", "Once upon a time", "sweet sensation"), books, ()->"No result that matches");
    }
}
