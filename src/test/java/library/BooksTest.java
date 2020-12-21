package library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class BooksTest {



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

    private ArrayList<CreateBook>testList;

    private Books testLibrary = new Bookshelf();


    @Before

    public void setUp() {


        testList=new ArrayList<>();
        CreateBook book1 = new CreateBook(); book1.setName(CreateBook.names.a); book1.setPages(231);
        CreateBook book2 = new CreateBook(); book2.setName(CreateBook.names.b); book2.setPages(300);
        CreateBook book3 = new CreateBook(); book3.setName(CreateBook.names.c); book3.setPages(450);
        CreateBook book4 = new CreateBook(); book4.setName(CreateBook.names.e); book4.setPages(720);
        CreateBook book5 = new CreateBook(); book5.setName(CreateBook.names.f); book5.setPages(280);
        CreateBook book6 = new CreateBook(); book6.setName(CreateBook.names.g); book6.setPages(180);
        CreateBook book7 = new CreateBook(); book7.setName(CreateBook.names.b); book7.setPages(300);
        CreateBook book8 = new CreateBook(); book8.setName(CreateBook.names.b); book8.setPages(300);
        CreateBook book9 = new CreateBook(); book9.setName(CreateBook.names.b); book9.setPages(300);
        CreateBook book10 = new CreateBook(); book10.setName(CreateBook.names.d); book10.setPages(420);

        testList.add(book1);
        testList.add(book2);
        testList.add(book3);
        testList.add(book4);
        testList.add(book5);
        testList.add(book6);
        testList.add(book7);
        testList.add(book8);
        testList.add(book9);
        testList.add(book10);

        testLibrary.BooksList = testList;

    }


    @Test
    public void getSumOfPagesInBooks() {

        int expected = 3481;

        int actual = Books.getSumOfPagesInBooks(testLibrary.getBooksList());

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void getAverageOfPagesInBooks() {
        double expected = 348.1;

        double actual = Books.getAverageOfPagesInBooks(testLibrary.getBooksList());

        Assert.assertEquals(expected, actual, 0);
    }


    @Test
    public void getMaxPagesInBook() {
        int expected = 720;

        int actual = Books.getMaxPagesInBook(testLibrary.getBooksList());

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getBooksWithFilter() {

        Map<Boolean, List<CreateBook>> expected = new HashMap<>();

        expected.put(Boolean.TRUE, Arrays.asList(testList.get(0), testList.get(1),testList.get(4),
                                        testList.get(5),testList.get(6),testList.get(7),testList.get(8)));
        expected.put(Boolean.FALSE, Arrays.asList(testList.get(2), testList.get(3), testList.get(9)));

        Map<Boolean, List<CreateBook>> actual;

        actual=Books.getBooksWithFilter(testLibrary.getBooksList(), x -> x.getPages()<350);

        Assert.assertEquals(actual, expected);


    }
}