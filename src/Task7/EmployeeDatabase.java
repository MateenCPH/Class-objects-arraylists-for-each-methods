package Task7;

import java.util.ArrayList;

public class EmployeeDatabase {

    private ArrayList<Employee> employeesList = new ArrayList<>();

    public EmployeeDatabase() {
        employeesList = new ArrayList<>();
    }

    public static void addEmployee(ArrayList<Employee> employees,Employee employee) {
        employees.add(employee);
    }

    public static void searchEmployeeID(ArrayList<Employee> employees, int id) {
        System.out.println("Searching for employeeID " + id);
        for (Employee employee : employees) {
            if (id == employee.getEmployeeID()) {
                System.out.println("Found one employee: ");
                System.out.println(employee);
            }
        }
    }

    public static void displayAllEmployees(ArrayList<Employee> employees) {
        System.out.println("Displaying all employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Reached end of display");
    }

    public static double avgSalary(ArrayList<Employee> employees) {
        double averageSalary = 0.0;
        System.out.println("The average salary of all employees in DKK: ");
        for (Employee employee : employees) {
            averageSalary += employee.getSalary() / employees.size();
        }
        return averageSalary;
    }


    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
}
