package Task6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        StudentDatabase database = new StudentDatabase();
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student(5,"Mateen","Rafiq",22,11.6);
        Student s2 = new Student(10,"Rodney","Muyanga",28,10.5);
        Student s3 = new Student(15,"Rebecca","Sørensen",25,8.5);
        Student s4 = new Student(20,"Marcus","Rasmussen",20,11.9);

        StudentDatabase.addStudents(students,s1);
        StudentDatabase.addStudents(students,s2);
        StudentDatabase.addStudents(students,s3);
        StudentDatabase.addStudents(students,s4);

        StudentDatabase.searchStudentID(students,10);

        StudentDatabase.displayAll(students);

        double avgGPA = StudentDatabase.avgGpa(students);
        System.out.println("The average GPA of all students is: " + avgGPA);
    }
}
