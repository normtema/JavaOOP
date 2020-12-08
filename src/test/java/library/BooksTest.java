package library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class BooksTest {

    @Test
    public void input() {

        String expected = "3";

//        Books temp= new Books();
//
//        String actual = ;
//
//        input();


    }

    @Test
    public void randomFillBooks() {

        CreateBook book1 = CreateBook.NewBook();
        CreateBook book2 = CreateBook.NewBook();
        CreateBook book3 = CreateBook.NewBook();
        CreateBook book4 = CreateBook.NewBook();
        CreateBook book5 = CreateBook.NewBook();
        CreateBook book6 = CreateBook.NewBook();
        CreateBook book7 = CreateBook.NewBook();
        CreateBook book8 = CreateBook.NewBook();
        CreateBook book9 = CreateBook.NewBook();
        CreateBook book10 = CreateBook.NewBook();

        int expected = 10;


        ArrayList<CreateBook> actual = new ArrayList<CreateBook>();

        actual.add(book1);
        actual.add(book2);
        actual.add(book3);
        actual.add(book4);
        actual.add(book5);
        actual.add(book6);
        actual.add(book7);
        actual.add(book8);
        actual.add(book9);
        actual.add(book10);

        Assert.assertEquals(expected, actual.size());
    }
}