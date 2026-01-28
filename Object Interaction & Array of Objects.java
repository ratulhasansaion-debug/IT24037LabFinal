class Book {
    String bookId;
    String title;
    double price;

    Book(String bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Price: " + price);
    }
}

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("B001", "Java Basics", 450);
        books[1] = new Book("B002", "Advanced Java", 600);
        books[2] = new Book("B003", "Data Structures", 550);
        books[3] = new Book("B004", "Algorithms", 700);
        books[4] = new Book("B005", "Database Systems", 300);

        double totalSum = 0;

        System.out.println("Books with price greater than 500:");
        for (Book b : books) {
            if (b.price > 500) {
                b.display();
            }
            totalSum += b.price;
        }

        double average = totalSum / books.length;
        System.out.println("\nAverage Price of all books: " + average);
    }
}
