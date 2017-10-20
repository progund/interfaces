package net.sortex.books;

import java.util.Comparator;

/**
 * A class for a comparator for Books.
 */
public class BookYearComparator implements Comparator<Book> {

  /**
   * Compares two Book objects, using the year as the primary
   * field for comparison. If the year is the same for both
   * Book objects, the Books' natural order (the Book class' own
   * compareTo method) is used.
   */
  public int compare(Book one, Book two) {
    if (one.year() == two.year()) {
      // Ok, same year.  How do check the names? .. why don't
      // use the compareTo method we've already written :)
      return one.compareTo(two);
    }
    return one.year() - two.year();
  }

}
