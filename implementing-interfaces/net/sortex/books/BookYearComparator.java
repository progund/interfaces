package net.sortex.books;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {

    public int compare(Book one, Book two) {
        if (one.year()==two.year()) {
            // Ok, same year.  How do check the names? .. why don't
            // use the compareTo method we've already written :)
            return one.compareTo(two);
        }
        return one.year()-two.year();
    }

}
