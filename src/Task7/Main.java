package Task7;

public class Main {

    public static void main(String[] args) {

        EmployeeDatabase database = new EmployeeDatabase();

        Employee one = new Employee(1,"Mateen","Rafiq",45500,22);
        Employee two = new Employee(2,"Rodney","Muyanga",37800,28);
        Employee three = new Employee(3,"Rebecca","Sørensen",89400,25);
        Employee four = new Employee(4,"Marcus","Rasmussen",55500,21);

        EmployeeDatabase.addEmployee(database.getEmployeesList(), one);
        EmployeeDatabase.addEmployee(database.getEmployeesList(), two);
        EmployeeDatabase.addEmployee(database.getEmployeesList(), three);
        EmployeeDatabase.addEmployee(database.getEmployeesList(), four);

        EmployeeDatabase.searchEmployeeID(database.getEmployeesList(),1);

        EmployeeDatabase.displayAllEmployees(database.getEmployeesList());

        double avgSalary = EmployeeDatabase.avgSalary(database.getEmployeesList());
        System.out.println(avgSalary);


    }
}
