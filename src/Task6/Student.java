package Task6;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;

    public Student(int studentID, String firstName, String lastName, int age, double gpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID + ". First name: " + firstName + ". Last name: " + lastName + ". Age: " + age + ". GPA: " + gpa;
    }
}
