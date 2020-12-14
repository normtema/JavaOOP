package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    public ArrayList<CreateBook> getBooksList() {
        return BooksList;
    }

    public abstract void display();

    public static int getSumOfPagesInBooks(List<CreateBook> list) {
        return list.stream().filter(x -> x.getPages() > 50).mapToInt(CreateBook::getPages).sum();
    }

    public static double getAverageOfPagesInBooks(List<CreateBook> list) {
        return list.stream().mapToInt(CreateBook::getPages).average().getAsDouble();
    }

    public static int getMaxPagesInBook(List<CreateBook> list) {
        return list.stream().mapToInt(CreateBook::getPages).max().getAsInt();
    }

    public static Map<Boolean, List<CreateBook>> getBooksWithFilter(List<CreateBook> list, Predicate<CreateBook> condition) {
        return list.stream().collect(Collectors.partitioningBy(condition));
    }

//    public static List<String> getMostFrequentNamesOfBooks(List<Bookshelf> list) {
//        List<String> result = new ArrayList<>();
//        list.stream()
//                .flatMap(x -> x.getBooksList().stream())
//                .collect(Collectors.toList())
//                .stream()
//                .collect(Collectors.groupingBy(CreateBook::getName))
//                .forEach((key, value) -> value.stream()
//                        .collect(Collectors.groupingBy(CreateBook::getName, Collectors.counting()))
//                        .entrySet()
//                        .stream()
//                        .max(Map.Entry.comparingByValue())
//                        .ifPresent(x -> result.add(x.getKey())));
//        return result;
//    }

}
