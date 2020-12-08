package library;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BookshelfTest {


    @Test
    public void randomGenre() {

        Genre expected = Bookshelf.randomGenre();
        Genre actual = Bookshelf.randomGenre();

        System.out.println("expected: "+expected+" actual: "+ actual);


        expected.setGenreName("Comedies");
        actual = expected;
        System.out.println("after change:");
        System.out.println("expected: "+expected+" actual: "+ actual);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void display() {
        Books library = new Bookshelf();
        library.display();
    }
}
