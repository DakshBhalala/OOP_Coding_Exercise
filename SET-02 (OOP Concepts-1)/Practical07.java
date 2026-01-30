import java.util.Scanner;

public class Practical07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        emp.readEmployeeData(scanner);
        emp.displayEmployeeData();
        scanner.close();
    }
}

class Employee {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(Scanner scanner) {
        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        employeeSalary = scanner.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}
