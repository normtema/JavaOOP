package library;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateBookTest {

    @Test
    public void newBook() {

        CreateBook expected = new CreateBook();

        CreateBook actual = new CreateBook(CreateBook.names.a, 134);

        expected.setName(CreateBook.names.a);
        expected.setPages(134);

        Assert.assertEquals(expected, actual);

    }


}