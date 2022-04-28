package net.sortex.books;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {

  public int compare(Book one, Book two) {
    return one.year() - two.year();
  }

}
