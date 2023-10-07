package Task6;

import java.util.ArrayList;

public class StudentDatabase {

    ArrayList<Student> students;

    public StudentDatabase() {
        this.students = new ArrayList<>();
    }

    public static void addStudents(ArrayList<Student> students, Student student) {
        students.add(student);
    }

    public static void searchStudentID(ArrayList<Student> students, int id) {
        for (Student student : students)
            if (student.getStudentID() == id) {
                System.out.println("Searching for student with studentID " + student.getStudentID() + ".... Found: " + student);
            }
    }

    public static void displayAll(ArrayList<Student> students) {
        System.out.println("Displaying all students:    ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Finished displaying all students.");
    }

    public static double avgGpa(ArrayList<Student> students) {
        double average = 0.0;
        for (Student student : students) {
            average += student.getGpa() / students.size();
        }
        return average;
    }
}

