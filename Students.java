// Students.java
import java.util.ArrayList;

public class Students {
    private ArrayList<Student> studentList;

    public Students() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("✅ Student added successfully!");
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("⚠️ No students registered yet!");
            return;
        }
        System.out.println("\n-------------------- STUDENT LIST --------------------");
        System.out.printf("%-5s %-20s%n", "ID", "Name");
        System.out.println("------------------------------------------------------");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------\n");
    }

    public Student findStudent(int id) {
        for (Student s : studentList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}
