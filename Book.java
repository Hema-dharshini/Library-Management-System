// Book.java
public class Book {
    private int id;
    private String title;
    private String author;
    private int availableQty;
    private int totalQty;

    public Book(int id, String title, String author, int totalQty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availableQty = totalQty;
        this.totalQty = totalQty;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getAvailableQty() { return availableQty; }
    public int getTotalQty() { return totalQty; }

    public void issueBook() {
        if (availableQty > 0) {
            availableQty--;
        }
    }

    public void returnBook() {
        if (availableQty < totalQty) {
            availableQty++;
        }
    }

    @Override
    public String toString() {
        return String.format("%-5d %-25s %-20s %-15d %-15d",
                id, title, author, availableQty, totalQty);
    }
}
