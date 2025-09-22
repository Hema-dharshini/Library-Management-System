// Library.java
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books books = new Books();
        Students students = new Students();

        while (true) {
            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Add Student");
            System.out.println("4. View All Students");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. View Student Borrowed Books");
            System.out.println("0. Exit");
            System.out.println("===============================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Total Quantity: ");
                    int qty = sc.nextInt();
                    books.addBook(new Book(id, title, author, qty));
                }
                case 2 -> books.displayBooks();
                case 3 -> {
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    students.addStudent(new Student(id, name));
                }
                case 4 -> students.displayStudents();
                case 5 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    Student student = students.findStudent(sid);
                    Book book = books.findBook(bid);
                    if (student != null && book != null) {
                        student.borrowBook(book);
                    } else {
                        System.out.println("⚠️ Invalid Student ID or Book ID!");
                    }
                }
                case 6 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    Student student = students.findStudent(sid);
                    Book book = books.findBook(bid);
                    if (student != null && book != null) {
                        student.returnBook(book);
                    } else {
                        System.out.println("⚠️ Invalid Student ID or Book ID!");
                    }
                }
                case 7 -> {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    Student student = students.findStudent(sid);
                    if (student != null) {
                        student.displayBorrowedBooks();
                    } else {
                        System.out.println("⚠️ Student not found!");
                    }
                }
                case 0 -> {
                    System.out.println("👋 Exiting Library Management System. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
