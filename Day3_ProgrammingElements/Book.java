class Book {
    static String libraryName = "City Central Library"; 
    private String title;
    private String author;
    private final String isbn; 

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        } else {
            System.out.println("Not a Book instance.");
        }
    }

    public String getISBN() {
        return isbn;
    }

    public static void main(String[] args) {
        displayLibraryName();
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "B001");
        b1.displayBookDetails(b1);
    }
}
