package aplicacao;

import entidade.Employee;

import java.util.Scanner;

public class sal_alg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Hoy much percentage will be increased to the salary? ");
        double pctg = sc.nextDouble();
        employee.increaseSalary(pctg);

        System.out.println();
        System.out.println("Updated data: " + employee);
        sc.close();


        sc.close();
    }
}
