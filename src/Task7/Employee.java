package Task7;

public class Employee {

    private int employeeID;
    private String firstName;
    private String lastName;
    private double salary;
    private int age;

    public Employee(int employeeID, String firstName, String lastName, double salary, int age) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "EmployeeID: " + employeeID + ". First name: " + firstName + ". Last name: " + lastName + ". Salary: " + salary + ". Age: " + age;
    }
}
