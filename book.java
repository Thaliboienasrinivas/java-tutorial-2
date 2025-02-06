public class Book {
    int bookID;
    String title;
    String author;
    boolean availabilityStatus;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = true; // Initially, assume the book is available
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (availabilityStatus ? "Available" : "Not Available"));
    }

    public boolean checkAvailability() {
        return availabilityStatus;
    }

    public void updateAvailability(boolean status) {
        this.availabilityStatus = status;
    }


    public static void main(String[] args) {
        Book book1 = new Book(101, "The Lord of the Rings", "J.R.R. Tolkien");
        book1.displayBookDetails();
        System.out.println("Is available: " + book1.checkAvailability());

        book1.updateAvailability(false); // Book is borrowed
        book1.displayBookDetails();
        System.out.println("Is available: " + book1.checkAvailability());


        Book book2 = new Book(102, "Pride and Prejudice", "Jane Austen");
        book2.displayBookDetails();

    }
}
