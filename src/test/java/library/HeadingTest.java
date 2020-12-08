package library;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeadingTest {

    @Test
    public void splitString() {
        
        Heading obj = new Heading();
        String[] expected =obj.splitString();

        String temp = "1_2_3";

        String[] actual = temp.split("_");

        Assert.assertEquals(expected.length, actual.length);
        // 3 because function split() split our string to 3 elements in array
        // because we have 2 symbols "_"
    }

    @Test
    public void getStringToSplit() {


         String expected = "--------------------------_----------Heading---------_--------------------------";

        Heading temp = new Heading();

        String actual = temp.getStringToSplit();
        Assert.assertEquals(expected, actual);
    }
}