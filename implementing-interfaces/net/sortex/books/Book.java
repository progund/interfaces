package net.sortex.books;

/**
 * Represents a Book. A Book has a name and a year.
 *
 * Please don't judge this class by its cover.
 */
public class Book implements Comparable<Book>{

  private String name;
  private int    year;

  private static final String SEPARATOR = ", ";

  /**
   * Constructs a new Book with the given name and year.
   */
  public Book(String name, int year) {
    this.name   = name;
    this.year   = year;
  }
  
  public String name() {
    return name;
  }

  public int year() {
    return year;
  }

  /**
   * Compares this Book with the given Book.
   * 
   * The comparison is done on this Book's name, and if the name is the same as
   * the name of the given Book, then the comparison is done using the year.
   */
  @Override
  public int compareTo(Book other) {
    int nameCheck = this.name.compareTo(other.name);
    if (nameCheck == 0) {
      return this.year - other.year;
    } else {
      return nameCheck;
    }
  }

  @Override
  public String toString() {
    return "(" + name + SEPARATOR + year + ")\n";
  }

}
