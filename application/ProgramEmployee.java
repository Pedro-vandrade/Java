package application;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;


public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter employee name: ");
        employee.name = sc.nextLine();
        System.out.printf("Enter employee gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.printf("Enter employee tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Name: " + employee.name + " Gross Salary: " + employee.grossSalary + " Tax: " + employee.tax);
        System.out.println("Salary after tax : " + employee.netSalary());
        System.out.println("Type the percentage of salary increase: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated Data: " + employee);


        sc.close();
    }
}
