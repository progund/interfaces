package net.sortex.books;

import java.util.Arrays;

public class Book implements Comparable<Book> {

    private String name;
    private int    year;

    private static final String SEPARATOR = ",";

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

    public int compareTo(Book anotherBook) {
        // Compare the String objects using String's own compareTo
        // this.name is a String, so it is compareTo in String we're invoking
        int nameCheck = this.name.compareTo(anotherBook.name());
        if (nameCheck==0) {
            // If the names are the same, check year
            return this.year - anotherBook.year();
        } else {
            return nameCheck;
        }
    }
    
    public String toString() {
        return "(" + name + SEPARATOR + year + ")\n";
    }
    
}
        
