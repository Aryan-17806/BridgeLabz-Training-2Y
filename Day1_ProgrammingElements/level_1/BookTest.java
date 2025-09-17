import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.printf("Price      : $%.2f\n", price);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the book title: ");
        String title = input.nextLine();

        System.out.print("Enter the author name: ");
        String author = input.nextLine();

        System.out.print("Enter the price of the book: ");
        double price = input.nextDouble();

        Book book = new Book(title, author, price);
        book.displayDetails();
        
        input.close();
    }
}
