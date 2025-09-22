// Student.java
import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void borrowBook(Book book) {
        if (book.getAvailableQty() > 0) {
            book.issueBook();
            borrowedBooks.add(book);
            System.out.println("✅ " + name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("❌ Book not available: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println("✅ " + name + " returned: " + book.getTitle());
        } else {
            System.out.println("⚠️ This book was not borrowed by " + name);
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed Books of " + name + ":");
        if (borrowedBooks.isEmpty()) {
            System.out.println("⚠️ No books borrowed yet!");
            return;
        }
        System.out.printf("%-5s %-25s %-20s%n", "ID", "Title", "Author");
        for (Book b : borrowedBooks) {
            System.out.printf("%-5d %-25s %-20s%n", b.getId(), b.getTitle(), b.getAuthor());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("%-5d %-20s", id, name);
    }
}
