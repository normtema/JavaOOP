package library;

import java.util.Random;

public class Bookshelf extends Books {
    String classification;
    private Heading heading = new Heading();

    public static Genre randomGenre() {
        int pick = (new Random()).nextInt(Genre.values().length);
        return Genre.values()[pick];
    }

    Bookshelf() {

    }

    public void display() {
        System.out.println("\n\n");
        this.heading.display();
        System.out.println(stringBuf());
        System.out.println("Cost of every book to put: "+ Price+ " UAH");
        System.out.println("\n\n"+ "Your bookshelf:");
        System.out.println(BooksList.toString());



    }

    public StringBuffer stringBuf() {
        StringBuffer temp = new StringBuffer();
        String temp1 = "Amount of Books on the Bookshelf: ";
        temp.append("Amount").append(" ").append("of").append(" ").append("books").append(" ").append("on").append(" ")
                .append("the").append(" ").append("Bookshelf").append(":").append(" ");

        if (temp.equals(temp1)) {
            temp.append(BooksList.size());
        }
        return temp;
    }


}
