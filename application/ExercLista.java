package application;
import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class ExercLista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
        }
        System.out.print("Enter the employee id tha will have the salary increase: ");





        sc.close();

    }
}

//String[] vect = new String[]{"Pedro", "Rue", "Vica"};
//
//        for (String item : vect) {
//        System.out.println(item + " ! ");