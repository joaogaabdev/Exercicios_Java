package exercicios;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployeeClass {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.printf("Gross salary: ", employee.glossSalary);
        employee.glossSalary = scanner.nextDouble();

        System.out.printf("Tax: ", employee.tax);
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee);
    }
}
