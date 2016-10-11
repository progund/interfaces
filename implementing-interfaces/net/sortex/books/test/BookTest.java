package net.sortex.books.test;

import net.sortex.books.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BookTest {

    public static void main(String[] args) {
        Book[] books = { new Book("ABC ... and more", 1980),
                         new Book("A book", 1980),
                         new Book("A book", 1981),
                         new Book("Book again", 1984),
                         new Book("Another book", 1990)
        };

        Arrays.sort(books);
        System.out.println(Arrays.toString(books));

        
    }

}
    
