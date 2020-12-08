package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heading {

    private Genre genre = Bookshelf.randomGenre();
    private String favoriteGenre = null;
    private String stringToSplit ="--------------------------_----------Heading---------_--------------------------";

    public Heading() {
        this.genre = null;
        this.favoriteGenre = null;
        this.stringToSplit = "--------------------------_----------Heading---------_--------------------------";
    }

    public void display() {


        for (String word : splitString()) {
            System.out.println(word);
        }
        System.out.println(this.genre);
    }

    public String[] splitString() {
        String[] temp2 = stringToSplit.split("_");
        return  temp2;
    }

    public String getStringToSplit() {
        return stringToSplit;
    }
}

