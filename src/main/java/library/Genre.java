package library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum Genre {
    detectives("Detectives"),
    dramas("Dramas"),
    comedies("Comedies"),
    fairytales("Fairy tales"),
    sciences("Sciences");

    private String GenreName;

    Genre(String GenreName) {this.GenreName = GenreName;}

    public String toString() { return "Genre is: "+this.GenreName; }

    public void setGenreName(String genreName) {
        GenreName = genreName;
    }
}
