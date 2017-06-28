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
        // We shall now compare the names (both String objects).
        // We do this by using using String's own compareTo
        //
        // this.name is a String, so we invoke compareTo on anotherBook's name
        int nameCheck = this.name.compareTo(anotherBook.name());
        if (nameCheck==0) {
            // If the names are the same, check year
            return this.year - anotherBook.year();
            /*
             * Perhaps the above code is easier understood if presented this way:
             * 
             * Get the two books' years and store them in separate variables:
             *   int year        = this.year;
             *   int anotherYear = anotherBook.year();
             *
             * Ok, we have the two year variables. The 
             *   return year - anotherYear;
             *
             */
        } else {
            return nameCheck;
        }
    }
    
    public String toString() {
        return "\n(" + name + SEPARATOR + year + ")";
    }
    
}
        
