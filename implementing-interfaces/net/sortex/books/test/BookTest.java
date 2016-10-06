package net.sortex.books.test;

import net.sortex.books.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BookTest {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("ABC ... and more", 1980));
        books.add(new Book("A book", 1980));
        books.add(new Book("A book", 1981));
        books.add(new Book("Book again", 1984));
        books.add(new Book("Another book", 1990));

        Collections.sort(books);
        System.out.println(Arrays.toString(books.toArray()));

        
    }

}
    
