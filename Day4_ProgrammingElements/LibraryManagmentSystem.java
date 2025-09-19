import java.util.ArrayList;
import java.util.Scanner;
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void showLibraryDetails() {
        System.out.println("\nLibrary: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books available in this library.");
        } else {
            System.out.println("Books:");
            for (Book b : books) {
                b.showBookDetails();
            }
        }
    }
}

public class LibraryManagmentSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of libraries: ");
        int numLibraries = input.nextInt();
        input.nextLine();

        Library[] libraries = new Library[numLibraries];
        for (int i = 0; i < numLibraries; i++) {
            System.out.print("Enter name of Library " + (i + 1) + ": ");
            String libName = input.nextLine();
            libraries[i] = new Library(libName);
        }

        System.out.print("\nEnter number of books: ");
        int numBooks = input.nextInt();
        input.nextLine();

        Book[] books = new Book[numBooks];
        for (int i = 0; i < numBooks; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("Author: ");
            String author = input.nextLine();
            books[i] = new Book(title, author);
        }

        for (int i = 0; i < numLibraries; i++) {
            System.out.println("\nAssign books to " + (i + 1) + " - " + libraries[i].toString());
            System.out.println("(Enter book numbers separated by space, -1 to stop):");

            for (int j = 0; j < books.length; j++) {
                System.out.println((j + 1) + ". " + books[j].toString());
            }

            while (true) {
                System.out.print("Enter book number (-1 to finish): ");
                int bookChoice = input.nextInt();
                if (bookChoice == -1) break;
                if (bookChoice >= 1 && bookChoice <= numBooks) {
                    libraries[i].addBook(books[bookChoice - 1]);
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }

        System.out.println("\n===== Library Details =====");
        for (Library lib : libraries) {
            lib.showLibraryDetails();
        }

        input.close();
    }
}
