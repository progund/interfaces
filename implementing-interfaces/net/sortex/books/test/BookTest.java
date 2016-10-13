package net.sortex.books.test;

import net.sortex.books.Book;
import net.sortex.books.BookYearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BookTest {

    public static void main(String[] args) {
        Book[] books = { new Book("ABC ... and more", 1980),
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

        System.out.println("Unsorted");
        System.out.println(Arrays.toString(books));        

        System.out.println("Sorted - using names and then year");
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));        

        System.out.println("Sorted using BookYearComparator - using year and then names");
        Arrays.sort(books, new BookYearComparator());
        System.out.println(Arrays.toString(books));        



    }

}
    
