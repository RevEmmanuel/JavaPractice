package Chapter8;

import java.util.EnumSet;

class BookTest {

    public static void main(String[] args) {
        System.out.println("Copyright is " + Book.IW3HTP.getCopyright());
        System.out.println("All the constants and contents of Book enum:");
        for (Book book : Book.values()) {
            // when you are using an enum in java, java automatically generates a static method called
            // values which returns an array that contains the constants of your enum in the
            // order they were declared.
            System.out.printf("%-15s%-45s%6s%n", book, book.getTitle(), book.getCopyright());
        }

        System.out.println("\nDisplay a range of enum constants: ");
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)) {
            // prints all the constants starting from constant JHTP to constant CPPHTP
            // in the order they were declared.
            // EnumSet is a predefined class and range is a static method in the class.
            System.out.printf("%-15s%-45s%6s%n", book, book.getTitle(), book.getCopyright());
        }
    }
}
