package library;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CreateBook {

    private names name;
    private int pages;
    public enum names {
        a("a"),
        b("b"),
        c("c"),
        d("d"),
        e("e"),
        f("f"),
        g("g"),
        h("h"),
        i("i"),
        j("j"),
        k("k"),
        l("l"),
        m("m"),
        n("n");

        private String bookname;

        names(String bookname) {this.bookname=bookname;}

        static names randomName() {
            int pick = (new Random()).nextInt(names.values().length);
            return names.values()[pick];
        }
    }

    public CreateBook(names name, int pages) {
        this.name =name;
        this.pages= pages;
    }

    public CreateBook() {
     this.name =names.randomName();
     this.pages= ThreadLocalRandom.current().nextInt(50, 600);
    }

    public static CreateBook NewBook() {
        CreateBook temp = new CreateBook();
        return temp;

    }
    public String toString() {

        return  ("\nname of book: "+this.name+", amount of pages: "+this.pages);
    }

    public void setName(names name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public names getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        CreateBook temp = (CreateBook) obj;
        return name.equals(temp.name) && Objects.equals(pages, temp.pages);
    }


}
