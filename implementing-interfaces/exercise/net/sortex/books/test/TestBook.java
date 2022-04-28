package net.sortex.books.test;

import java.util.Arrays;
import net.sortex.books.Book;
import net.sortex.books.BookYearComparator;

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
