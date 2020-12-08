package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Books {
    protected int Price;
    protected int AmountOfBooks;
    protected String ChoosedBook="5";
    protected ArrayList<CreateBook> BooksList;
    public Books() { this.RandomFillBooks();}

    public void RandomFillBooks() {
        this.Price = ThreadLocalRandom.current().nextInt(10, 150);
//        this.AmountOfBooks = ThreadLocalRandom.current().nextInt(5, 15);
        this.AmountOfBooks = 10;

        this.BooksList = new ArrayList<CreateBook>();
        for (int i=0; i<this.AmountOfBooks; i++) {
            BooksList.add(CreateBook.NewBook());
        }
    }


    public String input() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number of book you want to take:");


        try {
            this.ChoosedBook = reader.readLine();

        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());

        } finally {

            try {
                reader.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (ChoosedBook.equals("")) {
            throw new MyException("String can not be empty!");
        }
        System.out.println("You chosed "+ BooksList.get(Integer.parseInt(ChoosedBook) - 1));
        return ChoosedBook;
    }

    public abstract void display();
}
