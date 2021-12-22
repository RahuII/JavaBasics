package projects.library;
import java.util.Scanner;
    class Library{
        String[] books;
        int noOfBooks;
        Library(){
            this.books = new String[100];
            this.noOfBooks = 0;
        }
        void addBook(String book){
            this.books[noOfBooks] = book;
            noOfBooks ++;
            System.out.println(book+"has been added");
        }
        void showAvailableBooks(){
            System.out.println("===========================================================================");
            for (String book: this.books
                 ) {
                if (book == null){
                    continue;
                }
                System.out.println("* "+ book);
            }
            System.out.println("===========================================================================");
        }
        void issueBook(String book){
            for (int i = 0; i < this.books.length; i++) {
                if (this.books[i].equals(book)) {
                    this.books[i] = null;
                    System.out.println("* "+ book);
                    System.out.println("the book has been issued!");

                    return;
                }

            }

            System.out.println("this book does not exist");
        }
        void returnBook(String book){
            addBook(book);
        }

    }
public class Main {
    public static void main(String[] args) {
        // You have to implement a library using java class Library
        // Methods: issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books
        // Array to store the issued books
        Library l = new Library();
        l.addBook("Think and grow rich");
        l.addBook("hello world");
        l.addBook("The art of thinking clearly");
        l.addBook("The art of living");
        l.addBook("java");
        l.addBook("Python");
        l.returnBook("rahul");
        l.issueBook("java");
        l.showAvailableBooks();
    }
}
