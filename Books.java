// Books.java
import java.util.ArrayList;

public class Books {
    private ArrayList<Book> bookList;

    public Books() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("✅ Book added successfully!");
    }

    public void displayBooks() {
        if (bookList.isEmpty()) {
            System.out.println("⚠️ No books available in the library!");
            return;
        }
        System.out.println("\n-------------------- BOOK LIST --------------------");
        System.out.printf("%-5s %-25s %-20s %-15s %-15s%n",
                "ID", "Title", "Author", "Available", "Total");
        System.out.println("---------------------------------------------------");
        for (Book b : bookList) {
            System.out.println(b);
        }
        System.out.println("---------------------------------------------------\n");
    }

    public Book findBook(int id) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }
}
