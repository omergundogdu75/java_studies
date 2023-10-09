package ch8_Classes_and_Objects_deeper_look;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {

// print all books in enum Book
        for (Book book : Book.values()) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }

        System.out.printf("%nDisplay a range of enum constants:%n");
        Book.CPPHTP.setCopyrightYear("2020");
        // print first four books
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        }


    }
}
