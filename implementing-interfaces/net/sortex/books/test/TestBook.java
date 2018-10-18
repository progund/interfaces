package net.sortex.books.test;

import net.sortex.books.Book;
import net.sortex.books.BookYearComparator;
import java.util.Arrays;
import java.util.Comparator;

public class TestBook {

  public static void main(String[] args) {
    // Get an unordered array of books
    Book[] books = getUnordered();
    
    System.out.println("Unsorted");
    System.out.println(Arrays.toString(books));

    System.out.println("Sorted - using name, then year");
    Arrays.sort(books);
    System.out.println(Arrays.toString(books));

    // Start with a new unordered array
    books = getUnordered();
    System.out.println("Sorted using BookYearComparator - using year");
    Arrays.sort(books, new BookYearComparator());
    System.out.println(Arrays.toString(books));

    System.out.println("==================");

    // Below we have some more code to show you various ways to sort books
    // Java8 bonus:
    // We could write our own combined comparator using two
    // lambda expressions:
    // First year, then name:
    Comparator<Book> nameComparator = (b1, b2) ->
      b1.name().compareTo(b2.name());
    Comparator<Book> yearComparator = (b1, b2) ->
      b1.year() - b2.year();
    
    books = getUnordered();
    System.out.println("Sorting on year, then name:");
    Arrays.sort(books, yearComparator.thenComparing(nameComparator));
    System.out.println(Arrays.toString(books));

    books = getUnordered();    
    // Using the lambda above for sorting on year only:
    System.out.println("Sorting on year");
    Arrays.sort(books, yearComparator);
    System.out.println(Arrays.toString(books));

    Comparator<Book> nameComp1 = new BookNameComparator();
    Comparator<Book> nameComp2 = (b1,b2) -> b1.name().compareTo(b2.name());
    Comparator<Book> nameComp3 = Comparator.comparing(Book::name);
    Comparator<Book> nameComp4 = new Comparator<Book>() {
        @Override
        public int compare(Book b1, Book b2) {
          return b1.name().compareTo(b2.name());
        }
      };
    
    books = getUnordered();    
    System.out.println("Sorting on name using nameComp1");
    Arrays.sort(books, nameComp1);
    System.out.println(Arrays.toString(books));

    books = getUnordered();
    System.out.println("Sorting on name using nameComp2");
    Arrays.sort(books, nameComp2);
    System.out.println(Arrays.toString(books));

    books = getUnordered();
    System.out.println("Sorting on name using nameComp3");
    Arrays.sort(books, nameComp3);
    System.out.println(Arrays.toString(books));

    books = getUnordered();
    System.out.println("Sorting on name using nameComp4");
    Arrays.sort(books, nameComp4);
    System.out.println(Arrays.toString(books));

    // Alternative syntax:
    Comparator<Book> yearThenNameComp = yearComparator.thenComparing(nameComparator);        
    
  }


  /* We start with this unordered arry of Book references */
  static Book[] start = {
    new Book("ABC ... and more", 1980),
    new Book("A book", 1980),
    new Book("A book-3", 1982),
    new Book("A book-2", 1982),
    new Book("Book again", 1719),
    new Book("Book again", 1898),
    new Book("Book again", 2013),
    new Book("Book again - 3", 1984),
    new Book("Book again - 2", 1985),
    new Book("Another book", 1990)
  };
  
  /* Returns a copy of the unordered array start */
  static Book[] getUnordered() {
    Book[] unordered = new Book[start.length];
    System.arraycopy(start, 0, unordered, 0, start.length);
    return unordered;
  }
}
